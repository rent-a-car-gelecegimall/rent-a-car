package com.gelecegimall.rentacarbackend.database.entity;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cars")
@Data
public class CarEntity extends BaseEntity {

    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_id")
    private OfficeEntity office;

}
