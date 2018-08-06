package com.wsq.userservice.impl;

import com.wsq.common.cache.CacheService;
import com.wsq.common.cache.CacheType;
import com.wsq.common.rocketmq.Producer;
import com.wsq.providerapi.dto.UserDto;
import com.wsq.providerapi.feignInterface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserInterface {

    @Autowired
    private CacheService cacheService;

    @Autowired
    private Producer producer;

    @Override
    public UserDto getUserById(long id) {
        UserDto userDto = new UserDto(1, "王孙群");
        cacheService.add("user1", userDto, 60, CacheType.PASSPORT);
        UserDto result = cacheService.get("user1", CacheType.PASSPORT);
        return result;
    }
}
