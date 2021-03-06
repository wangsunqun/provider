package com.wsq.baseservice.impl;

import com.wsq.common.cache.CacheService;
import com.wsq.common.cache.CacheType;
import com.wsq.common.rocketmq.Producer;
import com.wsq.providerapi.dto.UserDto;
import com.wsq.providerapi.feignInterface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserInterface {

    @Autowired
    private CacheService cacheService;

    @Autowired
    private Producer producer;

    @Override
    public UserDto getUserById(@RequestParam("id") long id) {
        System.out.println("请求进来了");

        UserDto userDto = new UserDto(1, "王孙群");
        cacheService.add("user1", userDto, 60, CacheType.PASSPORT);
        UserDto result = cacheService.get("user1", CacheType.PASSPORT);
        try {

            producer.sendMsg("test", "VictorTest", "VictorTest", "test1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
