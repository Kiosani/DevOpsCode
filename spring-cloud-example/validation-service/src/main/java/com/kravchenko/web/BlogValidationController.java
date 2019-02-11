package com.kravchenko.web;

import com.kravchenko.model.Blog;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class BlogValidationController {

    @PostMapping(path = "/validate", consumes = "application/json")
    public String validate(@RequestBody Blog blog) {
        String blogName = blog.getBlogName();
        if (blogName.equals("myBlog"))
            return "good";
        return "bad";


    }
}
