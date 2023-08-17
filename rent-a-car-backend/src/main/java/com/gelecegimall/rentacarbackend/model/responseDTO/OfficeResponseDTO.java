package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class OfficeResponseDTO extends BaseDTO {


    private List<CarResponseDTO> carList;

    private String name;

    private AddressResponseDTO address;

    private CompanyResponseDTO company;

    private List<ContractResponseDTO> contractList;

}
