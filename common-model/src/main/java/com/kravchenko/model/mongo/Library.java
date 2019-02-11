package com.kravchenko.model.mongo;

import lombok.Data;

import java.util.List;

@Data
public class Library {

    private String id;
    private String name;
    private List<Book> books;


}
