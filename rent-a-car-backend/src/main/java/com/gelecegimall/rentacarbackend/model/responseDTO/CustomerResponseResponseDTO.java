package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CustomerResponseResponseDTO extends BaseResponseDTO {

    private String name;


    private AddressResponseResponseDTO address;

    private List<ContractResponseResponseDTO> contractList;

}
