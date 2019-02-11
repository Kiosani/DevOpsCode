package com.kravchenko.repository;

import com.kravchenko.model.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, Long>{
}
