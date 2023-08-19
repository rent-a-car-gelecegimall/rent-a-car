package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class CustomerRequestDTO extends BaseRequestDTO {

    private String name;


    private AddressRequestDTO address;

    private List<ContractRequestDTO> contractList;
}
