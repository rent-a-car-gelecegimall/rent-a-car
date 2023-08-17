package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.util.BaseDTO;
import jakarta.persistence.*;

import java.util.List;

public class CustomerResponseDTO extends BaseDTO {

    private String name;


    private AddressResponseDTO address;

    private List<ContractResponseDTO> contractList;

}
