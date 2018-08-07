package com.wsq.providerapi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
    private long id;
    private String userName;

    public UserDto(long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDto{" + "id=" + id + ", userName='" + userName + '\'' + '}';
    }
}
