package com.gelecegimall.rentacarbackend.util.security;

import lombok.Data;

@Data
public class LoginRequestDTO {

    private String email;
    private String password;
}
