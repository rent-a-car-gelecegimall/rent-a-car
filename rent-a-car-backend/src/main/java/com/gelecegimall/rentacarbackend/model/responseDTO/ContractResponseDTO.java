package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class ContractResponseDTO extends BaseDTO {


    private boolean isActive;


    private CustomerResponseDTO customer;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;


    private CarResponseDTO car;


    private OfficeResponseDTO fromOffice;


    private OfficeResponseDTO toOffice;

    private BigDecimal price;

}
