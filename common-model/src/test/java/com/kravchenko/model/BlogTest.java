package com.kravchenko.model;

import org.junit.Test;

import java.util.Set;

public class BlogTest {

    @Test
    public void shouldGenerateCorrectMethods() {
        //constructors
        Blog blog1 = new Blog();
        Blog blog = Blog.of("blog");

        //getters
        Long id = blog.getId();
        String blogName = blog.getBlogName();
        Set<BlogPost> posts = blog.getPosts();
        //toString equals hashCode
        String s = blog.toString();
        System.out.println(blog.hashCode());
    }

}