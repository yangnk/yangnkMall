package com.yangnk.order.domain;

import lombok.Data;

import java.util.List;


@Data
public class OrderParam {

    /*可用于避免重复生成订单*/
    private Long orderId;
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
    //选择购买的购物车商品
    private List<Long> itemIds;

}
