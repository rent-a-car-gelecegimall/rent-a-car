package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;

public class CarRequestDTO extends BaseRequestDTO {


    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

    private OfficeRequestDTO office;

}
