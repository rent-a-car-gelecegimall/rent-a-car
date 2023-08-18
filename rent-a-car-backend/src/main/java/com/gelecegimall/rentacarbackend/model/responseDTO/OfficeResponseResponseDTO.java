package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class OfficeResponseResponseDTO extends BaseResponseDTO {


    private List<CarResponseResponseDTO> carList;

    private String name;

    private AddressResponseResponseDTO address;

    private CompanyResponseResponseDTO company;

    private List<ContractResponseResponseDTO> contractList;

}
