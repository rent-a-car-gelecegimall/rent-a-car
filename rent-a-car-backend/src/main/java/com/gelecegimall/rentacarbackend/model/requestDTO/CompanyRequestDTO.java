package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanyRequestDTO extends BaseRequestDTO {

    private List<OfficeRequestDTO> officeList;

    private String name;


}
