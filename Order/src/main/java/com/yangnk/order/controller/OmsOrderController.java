package com.yangnk.order.controller;

import com.yangnk.order.common.CommonResult;
import com.yangnk.order.domain.OrderParam;
import com.yangnk.order.service.OmsOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OmsOrderController {

    @Autowired
    OmsOrderService omsOrderService;

    @RequestMapping(value = "/generateOrder", method = RequestMethod.POST)
    public CommonResult generateOrder(@RequestBody OrderParam orderParam,
                                      @RequestHeader("memberId") Long memberId) {
        return omsOrderService.generateOrder(orderParam, memberId);
    }

    @RequestMapping(value = "/insertOrder", method = RequestMethod.POST)
    public CommonResult insertOrder() {
        return omsOrderService.addOrder();
    }
}
