package com.gelecegimall.rentacarbackend.database.entity;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "contracts")
@Data
public class ContractEntity extends BaseEntity {

    private boolean isActive;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_id")
    private CarEntity car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_office_id")
    private OfficeEntity fromOffice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_office_id")
    private OfficeEntity toOffice;

    private BigDecimal price;



}
