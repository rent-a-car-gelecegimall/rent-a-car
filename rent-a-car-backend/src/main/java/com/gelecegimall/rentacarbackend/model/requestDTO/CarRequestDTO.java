package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.UUID;

@Data
public class CarRequestDTO extends BaseRequestDTO {

    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

    private Long officeId;

}
