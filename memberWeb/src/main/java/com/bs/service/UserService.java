package com.bs.service;

import com.bs.common.FeignConfig;
import com.bs.common.UserServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuxl on 2017/9/13.
 */

@Service
@FeignClient(value = "member", configuration = FeignConfig.class,fallback = UserServiceHystrix.class)
public interface UserService {

    @GetMapping(value = "/user/getAllUsers")
    String getUserList(/*@RequestParam(value = "name") String name*/);

}

