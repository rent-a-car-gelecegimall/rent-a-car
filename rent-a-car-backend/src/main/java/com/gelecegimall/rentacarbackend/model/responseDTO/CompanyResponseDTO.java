package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.util.BaseDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class CompanyResponseDTO extends BaseDTO {


    private List<OfficeResponseDTO> officeList;

    private String name;
}
