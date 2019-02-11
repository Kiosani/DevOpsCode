package com.kravchenko.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Igor on 20.09.2017.
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@EqualsAndHashCode(exclude = "blog")
@ToString(exclude = {"blog", "id"})
@Entity(name = "blog_post")
@Table(name = "blog_post")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "blog_post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    @NonNull
    private Blog blog;

    @Column(name = "author")
    @NonNull
    private String author;

    @Column(name = "post_text")
    @NonNull
    private String postText;

}
