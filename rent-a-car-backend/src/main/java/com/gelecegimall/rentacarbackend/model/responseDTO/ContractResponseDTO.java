package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class ContractResponseDTO extends BaseResponseDTO {

    private boolean isActive;

    private CustomerWithNameResponseDTO customer;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private CarResponseDTO car;

    private OfficeWithNameResponseDTO fromOffice;

    private OfficeWithNameResponseDTO toOffice;

    private BigDecimal price;

}
