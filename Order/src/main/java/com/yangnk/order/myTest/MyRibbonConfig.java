package com.yangnk.order.myTest;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.loadbalancer.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MyRibbonConfig {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机，默认是轮询
    }
//
//    @Bean
//    DefaultClientConfigImpl getDefaultClientConfigImpl() {
//        return new DefaultClientConfigImpl();
//    }
//
//    @Bean
//    BaseLoadBalancer getBaseLoadBalancer() {
//        return new BaseLoadBalancer();
//    }
//
//    @Bean
//    public IPing ribbonPing(){
//        return new PingUrl();
//    }

}
