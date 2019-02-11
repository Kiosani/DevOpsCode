package com.kravchenko.repository;

import com.kravchenko.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface ProductRepository extends CrudRepository<Product, String> {

    /**
     * rel is name of the link in the http://localhost:3006/products/search
     * use search by the following way
     * http://localhost:3006/products/search/by-id?id=1
     */
    @RestResource(path = "by-id", rel = "productSearchLinkName")
    Product findById(@Param(value = "id") String id);

    @Query("select p from Product p " +
            "left join fetch p.categoryId " +
            "left join fetch p.manufacturerId " +
            "left join fetch p.subCategoryId")
    Iterable<Product> findAll();

}
