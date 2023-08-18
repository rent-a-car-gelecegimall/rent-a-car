package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

@Data
public class AddressResponseResponseDTO extends BaseResponseDTO {

    private String city;

    private String phoneNumber;

    private String state;

}
