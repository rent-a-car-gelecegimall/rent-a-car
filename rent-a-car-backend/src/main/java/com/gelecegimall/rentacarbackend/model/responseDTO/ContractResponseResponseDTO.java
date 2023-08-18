package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class ContractResponseResponseDTO extends BaseResponseDTO {


    private boolean isActive;


    private CustomerResponseResponseDTO customer;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;


    private CarResponseResponseDTO car;


    private OfficeResponseResponseDTO fromOffice;


    private OfficeResponseResponseDTO toOffice;

    private BigDecimal price;

}
