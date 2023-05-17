package com.yangnk.order.service.impl;

import com.yangnk.order.api.UniqIdApi;
import com.yangnk.order.common.CommonResult;
import com.yangnk.order.common.ResultCode;
import com.yangnk.order.domain.OrderParam;
import com.yangnk.order.mapper.OmsOrderItemMapper;
import com.yangnk.order.mapper.OmsOrderMapper;
import com.yangnk.order.model.OmsOrder;
import com.yangnk.order.model.OmsOrderItem;
import com.yangnk.order.service.OmsOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class OmsOrderServiceImpl implements OmsOrderService {

    @Autowired
    UniqIdApi uniqIdApi;

    @Autowired
    OmsOrderMapper omsOrderMapper;

    @Autowired
    OmsOrderItemMapper omsOrderItemMapper;

    @Override
    @Transactional
    public CommonResult generateOrder(OrderParam orderParam, Long memberId) {

        //前置校验
        if (orderParam == null || memberId == null) {
            log.error("生成订单时，传参校验为空值");
            return CommonResult.failed(ResultCode.VALIDATE_FAILED, "生成订单时，传参校验为空值");
        }

        //(注意分布式事务处理)

        //生成订单号
        Long orderId = orderParam.getOrderId();
        if (null == orderId) {
            orderId = Long.valueOf(uniqIdApi.getSegmentId("order"));
        }

        //组装OmsOrder
        OmsOrder omsOrder = new OmsOrder();
        omsOrder.setId(orderId);
        omsOrder.setMemberId(memberId);

        //组装List<OmsOrderItem>
        List<Long> itemIdsList = orderParam.getItemIds();
        List<OmsOrderItem> orderItemList = new ArrayList<>();
        for (Long itemId : itemIdsList) {
            OmsOrderItem omsOrderItem = new OmsOrderItem();
            omsOrderItem.setOrderId(orderId);
            omsOrderItem.setId(itemId);
        }

        //insert到数据库中
        int insertCount = omsOrderMapper.insert(omsOrder);
        int insertListCount = omsOrderItemMapper.insertList(orderItemList);
        Map result = new HashMap();
        result.put("order", omsOrder);
        result.put("orderItem", orderItemList.toString());

        log.info("===会员：{}，成功创建订单===", memberId);
        return CommonResult.success(result, "成功创建订单");
    }
}
