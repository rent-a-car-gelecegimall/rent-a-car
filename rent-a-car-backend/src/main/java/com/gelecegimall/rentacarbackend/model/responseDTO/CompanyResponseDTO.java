package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanyResponseDTO extends BaseResponseDTO {


    private List<OfficeWithoutCompanyResponseDTO> officeList;

    private String name;
}
