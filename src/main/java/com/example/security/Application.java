package com.example.security;

import com.example.security.model.Post;
import com.example.security.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(PostRepository repository) {
        return args -> {
/*            repository.save(new Post(1, "title1", "content1"));
            repository.save(new Post(2, "title2", "content2"));
            repository.save(new Post(3, "title3", "content3"));
            repository.save(new Post(4, "title4", "content4"));
            repository.save(new Post(5, "title5", "content5"));*/
        };
    }
}
