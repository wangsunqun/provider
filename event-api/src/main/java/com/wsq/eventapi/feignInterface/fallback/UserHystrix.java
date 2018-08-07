package com.wsq.eventapi.feignInterface.fallback;

import com.wsq.eventapi.dto.UserDto;
import com.wsq.eventapi.feignInterface.UserInterface;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("fallback/user")
public class UserHystrix implements UserInterface {

    @Override
    public UserDto getUserById(long id) {
        UserDto dto = new UserDto();
        dto.setUserName("fallback");
        return dto;
    }
}
