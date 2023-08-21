package com.gelecegimall.rentacarbackend.util.security;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.Set;
@Data
public class UserRequestDTO extends BaseRequestDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String photoLink;
    private boolean isEnable;
    private Set<RoleRequestDTO> roles;

    public UserRequestDTO() {
        isEnable = false;
    }
}
