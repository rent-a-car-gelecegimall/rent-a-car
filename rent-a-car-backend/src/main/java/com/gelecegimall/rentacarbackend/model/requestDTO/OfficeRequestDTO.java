package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.CompanyEntity;
import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class OfficeRequestDTO extends BaseRequestDTO {

    private List<CarRequestDTO> carList;

    private String name;

    private AddressRequestDTO address;

    private CompanyRequestDTO company;

    private List<ContractRequestDTO> contractList;
}
