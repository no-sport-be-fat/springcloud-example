package com.bs.common;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置:更改了该FeignClient的重试次数，重试间隔为100ms，最大重试时间为1s,重试次数为5次
 * Created by liuxl on 2017/9/13.
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, 1000, 5);
    }
}
