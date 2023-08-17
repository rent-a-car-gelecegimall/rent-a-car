package com.gelecegimall.rentacarbackend.database.entity;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "companies")
@Data
public class CompanyEntity extends BaseEntity {

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OfficeEntity> officeList;

    private String name;
}
