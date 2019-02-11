package com.kravchenko.web;


import com.kravchenko.model.Blog;
import com.kravchenko.service.BlogPostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/blog")
public class BlogController {

    private BlogPostService blogPostService;

    public BlogController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public void createBlog(@RequestParam(defaultValue = "IgorBlog") String blogName) {
        blogPostService.createBlog(blogName);
    }

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public Iterable<Blog> getAll() {
        return blogPostService.getAllBlogs();
    }

}
