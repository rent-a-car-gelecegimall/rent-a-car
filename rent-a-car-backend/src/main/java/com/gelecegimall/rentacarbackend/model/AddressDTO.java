package com.gelecegimall.rentacarbackend.model;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

@Data
public class AddressDTO extends BaseDTO {

    private String city;

    private String phoneNumber;

    private String state;

}
