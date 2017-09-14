package com.bs.common;

import com.alibaba.fastjson.JSON;
import com.bs.entity.FeginError;
import com.bs.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 注意说明：UserServiceHystrix需要实现TestService接口，并注入到Ioc容器中
 */
@Component//把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>(TestService已经通过@service注册进去了)
//继承TestService是因为这样可以运行同样的方法
public class UserServiceHystrix implements UserService{
    @Override
    public String getUserList() {
        FeginError error = new FeginError("member_001","member服务宕机了");
        return JSON.toJSONString(error);
    }
}
