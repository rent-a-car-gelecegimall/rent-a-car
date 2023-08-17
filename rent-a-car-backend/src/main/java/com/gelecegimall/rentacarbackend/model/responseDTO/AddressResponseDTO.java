package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

@Data
public class AddressResponseDTO extends BaseDTO {

    private String city;

    private String phoneNumber;

    private String state;

}
