package com.kravchenko.web;


import com.kravchenko.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/blog")
public class BlogController {

    private final RestTemplate restTemplate;

    private ArrayList<Blog> db = new ArrayList<Blog>() {{
        add(Blog.of("igorBlog"));
        add(Blog.of("notIgorBlog"));
        add(Blog.of("JohnBlog"));
    }};

    @Autowired
    public BlogController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @PostMapping(path = "/create")
    public void createBlog(@RequestParam(defaultValue = "IgorBlog") String blogName) {
        db.add(Blog.of(blogName));
    }

    @GetMapping(path = "/all", produces = "application/json")
    public Iterable<Blog> getAll() {
        return db;
    }

    @GetMapping(path = "/validate/{blog.name}", produces = "text/plain")
    public String validateBlog(@PathVariable(name = "blog.name") String blogName) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Blog> entity = new HttpEntity<Blog>(Blog.of(blogName), headers);

        ResponseEntity<String> response = restTemplate.exchange("http://ValidationService/validate", HttpMethod.POST, entity, String.class);
        return response.getBody();
    }
}
