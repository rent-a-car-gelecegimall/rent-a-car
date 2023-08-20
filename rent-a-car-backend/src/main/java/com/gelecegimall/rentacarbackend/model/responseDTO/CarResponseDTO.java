package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.enums.CarStatusEnum;
import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

@Data
public class CarResponseDTO extends BaseResponseDTO {

    private CarStatusEnum carStatusEnum;

    private String model;

    private String brand;

    private String licensePlate;

    private OfficeWithNameResponseDTO office;

}
