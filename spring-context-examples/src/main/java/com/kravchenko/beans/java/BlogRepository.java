package com.kravchenko.beans.java;

import com.kravchenko.model.Blog;

import java.util.List;

public interface BlogRepository {

    void save(Blog blog);

    List<Blog> getAll();
}
