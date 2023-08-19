package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class OfficeRequestDTO extends BaseRequestDTO {

    private String name;

    private AddressRequestDTO address;

    private Long companyId;
}
