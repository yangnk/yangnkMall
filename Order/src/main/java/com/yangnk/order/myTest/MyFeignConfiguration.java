//package com.yangnk.order.myTest;
//
//import feign.Util;
//import feign.codec.ErrorDecoder;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
//@Slf4j
//@Configuration
//public class MyFeignConfiguration {
//
//    @Bean
//    public ErrorDecoder errorDecoder() {
//
//        return new ErrorDecoder.Default();
////        return (methodKey, response) -> {
////            Exception exception = new GlobalException(ResultCommonEnum.REMOTE_SERVICE_EXCEPTION.code(), "");
////            try {
////                // 获取原始的返回内容
////                String respBody = Util.toString(response.body().asReader());
////                log.error("FeignError:{}", respBody);
////                if (JSONUtil.isJsonObj(respBody)) {
////                    ResultVO resultVO = JSON.parseObject(respBody, ResultVO.class);
////                    if (Objects.nonNull(resultVO)) {
////                        if (Objects.nonNull(resultVO.getCode()) && !resultVO.isSuccess()) {
////                            exception = new GlobalException(resultVO.getCode(), resultVO.getMsg());
////                        }
////                    }
////                }
////            } catch (IOException ex) {
////                log.error(ex.getMessage(), ex);
////            }
////            return exception;
////        };
//    }
//}