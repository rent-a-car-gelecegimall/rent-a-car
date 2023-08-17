package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;

import java.util.List;

public class CompanyRequestDTO extends BaseRequestDTO {

    private List<OfficeRequestDTO> officeList;

    private String name;

}
