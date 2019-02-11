package com.kravchenko.beans.java;

import com.kravchenko.model.Blog;
import com.kravchenko.model.BlogPost;

import javax.transaction.Transactional;

public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Transactional
    public String createBlogs() {
        Blog programmingRoad = Blog.of("Programming road");
        BlogPost blogPost = BlogPost.of(programmingRoad, "Igor K", "This is my road. Welcome aboard");
        programmingRoad.addPost(blogPost);
        blogRepository.save(programmingRoad);
        blogRepository.save(Blog.of("Literature club"));
        blogRepository.save(Blog.of("Eating grenades"));
        return "Success";
    }

    @Transactional
    public void printAllBlogs(){
        blogRepository.getAll().forEach(System.out::println);
    }
}
