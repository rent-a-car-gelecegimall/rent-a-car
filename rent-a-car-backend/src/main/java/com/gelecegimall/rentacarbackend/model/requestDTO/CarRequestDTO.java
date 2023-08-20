package com.gelecegimall.rentacarbackend.model.requestDTO;

import com.gelecegimall.rentacarbackend.enums.CarStatusEnum;
import com.gelecegimall.rentacarbackend.util.BaseRequestDTO;
import lombok.Data;

import java.util.UUID;

@Data
public class CarRequestDTO extends BaseRequestDTO {

    private CarStatusEnum carStatusEnum;

    private String model;

    private String brand;

    private String licensePlate;

    private Long officeId;

}
