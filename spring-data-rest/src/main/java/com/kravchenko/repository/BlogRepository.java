package com.kravchenko.repository;

import com.kravchenko.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface BlogRepository extends CrudRepository<Blog, Long> {

    Collection<Blog> findByBlogName(@Param("blogName") String blogName);

    Blog findById(@Param("blogId") Long blogId);


}
