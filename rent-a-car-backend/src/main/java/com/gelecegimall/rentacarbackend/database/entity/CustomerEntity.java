package com.gelecegimall.rentacarbackend.database.entity;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
public class CustomerEntity extends BaseEntity {

    private String name;

    @OneToOne(cascade = CascadeType.ALL) // Added CascadeType.ALL for cascading operations
    @JoinColumn(name = "address_id") // Added a join column to specify the foreign key
    private AddressEntity address;

    @OneToMany(mappedBy = "customer",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private List<ContractEntity> contractList;
}
