package com.kravchenko.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {

    @Id
    private String id;
    @Column(name = "category_name")
    private String categoryName;
}
