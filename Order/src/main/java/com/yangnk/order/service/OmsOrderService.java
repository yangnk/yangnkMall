package com.yangnk.order.service;

import com.yangnk.order.common.CommonResult;
import com.yangnk.order.domain.OrderParam;

public interface OmsOrderService {

    CommonResult generateOrder(OrderParam orderParam, Long memberId);
}
