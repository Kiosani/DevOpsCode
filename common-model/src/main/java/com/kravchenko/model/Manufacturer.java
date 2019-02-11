package com.kravchenko.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Manufacturer {
    @Id
    private String id;
    @Column(name = "manufacturer_name")
    private String manufacturerName;
}
