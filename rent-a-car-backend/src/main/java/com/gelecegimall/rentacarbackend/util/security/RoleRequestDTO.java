package com.gelecegimall.rentacarbackend.util.security;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

@Data
public class RoleRequestDTO extends BaseRequestDTO {
    private String name;
}
