package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CustomerResponseDTO extends BaseResponseDTO {

    private String name;


    private AddressResponseDTO address;

    private List<ContractResponseDTO> contractList;

}
