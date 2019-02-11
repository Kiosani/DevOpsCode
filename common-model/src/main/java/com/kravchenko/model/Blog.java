package com.kravchenko.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor(staticName = "of")
@NoArgsConstructor
@Data
@Entity(name = "blog")
@Table(name = "blog")
public class Blog {

    @Id
    @Column(name = "blog_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blog_name")
    @NonNull
    private String blogName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "blog")
    private Set<BlogPost> posts = new HashSet<>();

    public void addPost(BlogPost post) {
        posts.add(post);
    }
}
