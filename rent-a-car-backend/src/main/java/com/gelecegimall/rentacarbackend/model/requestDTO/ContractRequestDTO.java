package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class ContractRequestDTO extends BaseRequestDTO {

    private boolean isActive;


    private CustomerRequestDTO customer;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;


    private CarRequestDTO car;


    private OfficeRequestDTO fromOffice;


    private OfficeRequestDTO toOffice;

    private BigDecimal price;
}
