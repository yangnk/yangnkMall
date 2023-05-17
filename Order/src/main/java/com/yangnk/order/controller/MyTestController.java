package com.yangnk.order.controller;

import com.yangnk.order.api.UniqIdApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyTestController {

    @Autowired
    UniqIdApi uniqIdApi;

    @RequestMapping(value = "/test/{key}")
    String test(@PathVariable("key") String key) {
        String city = uniqIdApi.getSegmentId("city");

        log.info(">>>>>>>>>", city);
        return city;
    }

}
