package com.kravchenko.web;


import com.kravchenko.model.BlogPost;
import com.kravchenko.service.BlogPostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/post")
public class PostController {

    private BlogPostService blogPostService;

    public PostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public void createPost(@RequestParam(defaultValue = "Igor") String author,
                           @RequestParam(defaultValue = "SomeText") String message) {
        blogPostService.createPost(author, message);
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public Iterable<BlogPost> getAllPost() {
        return blogPostService.getAllPosts();
    }
}
