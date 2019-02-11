package com.kravchenko.model;

import org.junit.Test;

public class ProductTest {
    @Test
    public void productTest() {
        Product product = new Product();
        String id = product.getId();
        String productName = product.getProductName();
        product.setProductName("Macbook");
    }

}