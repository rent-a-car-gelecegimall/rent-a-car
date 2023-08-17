package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseDTO;
import lombok.Data;

@Data
public class CarResponseDTO extends BaseDTO {

    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

    private OfficeResponseDTO office;

}
