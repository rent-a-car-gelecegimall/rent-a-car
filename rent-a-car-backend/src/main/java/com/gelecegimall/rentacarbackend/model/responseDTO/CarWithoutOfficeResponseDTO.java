package com.gelecegimall.rentacarbackend.model.responseDTO;

import lombok.Data;

@Data
public class CarWithoutOfficeResponseDTO extends OfficeResponseDTO {
    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

}
