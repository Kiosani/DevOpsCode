package com.kravchenko.repository;

import com.kravchenko.model.BlogPost;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Igor on 21.09.2017.
 */
public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{
}
