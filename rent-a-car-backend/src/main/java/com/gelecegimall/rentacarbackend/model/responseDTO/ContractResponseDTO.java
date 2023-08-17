package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.CustomerEntity;
import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.util.BaseDTO;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

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
