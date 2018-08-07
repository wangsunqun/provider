package com.wsq.eventapi.feignInterface;

import com.wsq.eventapi.dto.UserDto;
import com.wsq.eventapi.feignInterface.fallback.UserHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider", fallback = UserHystrix.class)
@RequestMapping("user")
public interface UserInterface {

    @RequestMapping("getUserById")
    UserDto getUserById(@RequestParam("id")long id);
}
