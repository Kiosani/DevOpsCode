package com.kravchenko.beans.java;

import com.kravchenko.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Blog blog) {
        em.persist(blog);
    }

    @Override
    public List<Blog> getAll() {
        return em.createQuery("select b from blog b", Blog.class).getResultList();
    }


}
