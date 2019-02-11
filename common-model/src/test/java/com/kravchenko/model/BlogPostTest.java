package com.kravchenko.model;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BlogPostTest {

    @Test
    public void shouldGenerateCorrectMethods() {
        Blog blog = Blog.of("blog");
        BlogPost blogPost = BlogPost.of(blog,"author", "thi is post text");
        new BlogPost();
        String author = blogPost.getAuthor();
        Long id = blogPost.getId();
        Blog blog1 = blogPost.getBlog();
        String postText = blogPost.getPostText();
        String s = blogPost.toString();
    }


}