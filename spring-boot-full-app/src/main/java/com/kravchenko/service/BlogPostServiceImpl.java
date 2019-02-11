package com.kravchenko.service;

import com.kravchenko.model.Blog;
import com.kravchenko.model.BlogPost;
import com.kravchenko.repository.BlogPostRepository;
import com.kravchenko.repository.BlogRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    private BlogPostRepository blogPostRepository;
    private BlogRepository blogRepository;

    public BlogPostServiceImpl(BlogPostRepository blogPostRepository, BlogRepository blogRepository) {
        this.blogPostRepository = blogPostRepository;
        this.blogRepository = blogRepository;
    }

    @Override
    @Transactional
    public void createPost(String author, String message) {
        BlogPost blogRecord = new BlogPost();
        blogRecord.setAuthor(author);
        blogRecord.setPostText(message);

        blogPostRepository.save(blogRecord);
    }

    @Override
    public Iterable<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public Iterable<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    @Transactional
    public void createBlog(String blogName) {
        Blog blog = new Blog();
        blog.setBlogName(blogName);
        blogRepository.save(blog);
    }
}
