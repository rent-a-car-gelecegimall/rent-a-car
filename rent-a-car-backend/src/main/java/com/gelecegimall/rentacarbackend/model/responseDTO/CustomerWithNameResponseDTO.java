package com.gelecegimall.rentacarbackend.model.responseDTO;

import com.gelecegimall.rentacarbackend.util.BaseResponseDTO;
import lombok.Data;

@Data
public class CustomerWithNameResponseDTO extends BaseResponseDTO {

    private String name;
}
