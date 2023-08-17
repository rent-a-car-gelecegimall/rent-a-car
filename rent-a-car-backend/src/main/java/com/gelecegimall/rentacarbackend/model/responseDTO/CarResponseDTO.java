package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.util.BaseDTO;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class CarResponseDTO extends BaseDTO {

    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

    private OfficeResponseDTO office;

}
