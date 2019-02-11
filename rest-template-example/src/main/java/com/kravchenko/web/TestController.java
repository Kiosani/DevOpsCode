package com.kravchenko.web;

import com.kravchenko.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestController {

    private static final ArrayList<Blog> BLOG_ARRAY_LIST = new ArrayList<Blog>() {{
        add(Blog.of("one"));
        add(Blog.of("two"));
        add(Blog.of("three"));
    }};
    private final RestTemplate restTemplate;


    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(path = "/health")
    public String healthCheck(@RequestParam(defaultValue = "Igor") String author,
                              @RequestParam(defaultValue = "SomeText") String message) {
        return author + " " + message;
    }

    @GetMapping(path = "/blogs")
    public List<Blog> getBlogs() {
        return BLOG_ARRAY_LIST;
    }

    @GetMapping(path = "/request")
    public int sendRequestForBlog() {
        ResponseEntity<ArrayList> forEntity = restTemplate.getForEntity( "http://localhost:3001/blogs", ArrayList.class, Collections.emptyMap());
        return forEntity.getBody().size();
    }

    @PostMapping(path = "/bodycheck", headers = "Content-Type=application/json")
    public String readBody(@RequestBody String var) {
        return "This is body=[" + var + "]";
    }

    @GetMapping(path = "/requestWithHeaders")
    public void customRequestWithHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("{ \"name\":\"this is my body\"}", headers);
        String url = "http://localhost:3001/bodycheck";
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }
}
