package com.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
//@RestController
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

//    @Value("${foo}")
//    String foo;
//
//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return foo;
//    }
}
