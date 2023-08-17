package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.CustomerEntity;
import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

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
