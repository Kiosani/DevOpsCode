package com.kravchenko.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data(staticConstructor = "of")
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    private String id;
    @Column(name = "product_name")
    private String productName;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;
    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategoryId;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturerId;
    @Column(name = "is_trashed")
    private Boolean isTrashed;

}
