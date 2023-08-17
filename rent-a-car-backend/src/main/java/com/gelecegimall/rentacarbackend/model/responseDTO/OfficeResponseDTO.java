package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.CompanyEntity;
import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.util.BaseDTO;
import jakarta.persistence.*;

import java.util.List;

public class OfficeResponseDTO extends BaseDTO {



    private List<CarResponseDTO> carList;

    private String name;

    private AddressResponseDTO address;

    private CompanyResponseDTO company;

    private List<ContractResponseDTO> contractList;

}
