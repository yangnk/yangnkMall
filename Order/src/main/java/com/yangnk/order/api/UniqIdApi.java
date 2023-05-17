package com.yangnk.order.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "yangnkMall-unqid")
public interface UniqIdApi {

    @RequestMapping(value = "/api/segment/get/{key}")
    String getSegmentId(@PathVariable("key") String key);

}
