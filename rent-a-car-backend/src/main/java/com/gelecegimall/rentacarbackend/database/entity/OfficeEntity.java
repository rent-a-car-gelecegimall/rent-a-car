package com.gelecegimall.rentacarbackend.database.entity;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "offices")
@Data
public class OfficeEntity extends BaseEntity {

    @OneToMany(mappedBy = "office", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<CarEntity> carList;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "company_id")
    private CompanyEntity company;

    @OneToMany(mappedBy = "fromOffice")
    private List<ContractEntity> contractList;

}
