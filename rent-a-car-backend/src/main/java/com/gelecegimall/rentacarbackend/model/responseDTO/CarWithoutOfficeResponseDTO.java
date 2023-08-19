package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

@Data
public class CarWithoutOfficeResponseDTO extends BaseResponseDTO {
    private boolean isRented;

    private String model;

    private String brand;

    private String licensePlate;

}
