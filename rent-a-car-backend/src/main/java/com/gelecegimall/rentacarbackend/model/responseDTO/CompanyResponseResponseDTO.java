package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanyResponseResponseDTO extends BaseResponseDTO {


    private List<OfficeResponseResponseDTO> officeList;

    private String name;
}
