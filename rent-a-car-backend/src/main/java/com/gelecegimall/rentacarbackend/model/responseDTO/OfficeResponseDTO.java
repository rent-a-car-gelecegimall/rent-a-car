package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class OfficeResponseDTO extends BaseResponseDTO {


    private List<CarResponseDTO> carList;

    private String name;

    private AddressResponseDTO address;

    private CompanyResponseDTO company;

    private List<ContractResponseDTO> contractList;

}
