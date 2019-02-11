package com.kravchenko.service;

import com.kravchenko.model.Blog;
import com.kravchenko.model.BlogPost;

import javax.transaction.Transactional;

public interface BlogPostService {

    void createPost(String author, String message);

    Iterable<BlogPost> getAllPosts();

    Iterable<Blog> getAllBlogs();

    void createBlog(String blogName);
}
