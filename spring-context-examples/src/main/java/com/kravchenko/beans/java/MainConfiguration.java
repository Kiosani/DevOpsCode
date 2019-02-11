package com.kravchenko.beans.java;

import org.springframework.context.annotation.*;

@Configuration
@Import(DbConfiguration.class)
@ComponentScan("com.kravchenko.beans.annotation")
@PropertySource(value = "application.properties")
@ImportResource("classpath:application-context.xml")
public class MainConfiguration {
    @Bean
    public ValidationService validationService() {
        return new ValidationServiceImpl(userService());
    }

    @Bean
    public BlogService userService() {
        return new BlogServiceImpl(blogRepository());
    }

    @Bean
    public BlogRepository blogRepository() {
        return new BlogRepositoryImpl();
    }

}
