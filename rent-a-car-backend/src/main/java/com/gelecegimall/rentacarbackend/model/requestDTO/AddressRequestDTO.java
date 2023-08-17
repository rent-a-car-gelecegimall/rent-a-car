package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class AddressRequestDTO extends BaseRequestDTO {

    private String city;

    private String phoneNumber;

    private String state;


}
