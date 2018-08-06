package com.wsq.userservice.controller;

import com.wsq.providerapi.dto.UserDto;
import com.wsq.providerapi.feignInterface.UserInterface;
import com.wsq.userservice.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserInterface {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDto getUserById(@RequestParam("id") long id) {
        System.out.println("请求进来了");
        UserDto result = userService.getUserById(1);
        return result;
    }
}
