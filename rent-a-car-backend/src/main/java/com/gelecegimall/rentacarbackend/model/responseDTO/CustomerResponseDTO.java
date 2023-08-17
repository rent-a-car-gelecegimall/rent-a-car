package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CustomerResponseDTO extends BaseDTO {

    private String name;


    private AddressResponseDTO address;

    private List<ContractResponseDTO> contractList;

}
