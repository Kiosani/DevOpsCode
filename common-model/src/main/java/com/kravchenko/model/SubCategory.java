package com.kravchenko.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "sub_category")
public class SubCategory {

    @Id
    private String id;
    @Column(name = "sub_category_name")
    private String subCategoryName;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
