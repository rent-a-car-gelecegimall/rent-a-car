package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class ContractRequestDTO extends BaseRequestDTO {

    private boolean isActive;

    private Long customerId;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private Long carId;

    private Long fromOfficeId;

    private Long toOfficeId;

    private BigDecimal price;
}
