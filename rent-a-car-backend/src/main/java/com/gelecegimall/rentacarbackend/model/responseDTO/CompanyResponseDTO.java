package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanyResponseDTO extends BaseDTO {


    private List<OfficeResponseDTO> officeList;

    private String name;
}
