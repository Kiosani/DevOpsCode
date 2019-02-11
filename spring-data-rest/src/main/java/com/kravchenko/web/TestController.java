package com.kravchenko.web;

import com.kravchenko.model.Blog;
import com.kravchenko.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final BlogRepository blogRepository;

    @Autowired
    public TestController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @GetMapping(path = "/boom")
    public Iterable<Blog> get() {
        return blogRepository.findAll();
    }

}
