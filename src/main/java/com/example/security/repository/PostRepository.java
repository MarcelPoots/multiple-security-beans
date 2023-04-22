package com.example.security.repository;

import com.example.security.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository  extends ListCrudRepository<Post,Integer> {
}
