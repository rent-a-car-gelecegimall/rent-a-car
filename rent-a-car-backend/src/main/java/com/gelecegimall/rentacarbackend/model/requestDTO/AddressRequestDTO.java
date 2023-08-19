package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

@Data
public class AddressRequestDTO extends BaseRequestDTO {

    private String city;

    private String phoneNumber;

    private String state;

}
