package com.gelecegimall.rentacarbackend.database.entity;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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

    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime startDate;

    @Temporal(TemporalType.TIMESTAMP)
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
