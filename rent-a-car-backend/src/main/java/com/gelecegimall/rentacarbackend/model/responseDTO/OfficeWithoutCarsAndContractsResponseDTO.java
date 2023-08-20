package com.gelecegimall.rentacarbackend.model.responseDTO;

import lombok.Data;

@Data
public class OfficeWithoutCarsAndContractsResponseDTO {

    private String name;

    private AddressResponseDTO address;

    private CompanyWithoutOfficeResponseDTO company;

}
