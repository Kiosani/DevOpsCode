package com.kravchenko.beans.java;

public class ValidationServiceImpl implements ValidationService {

    private BlogService blogService;

    public ValidationServiceImpl(BlogService blogService) {
        this.blogService = blogService;
    }

    public boolean validation() {
        return false;
    }
}
