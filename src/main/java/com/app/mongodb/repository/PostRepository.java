package com.app.mongodb.repository;

import com.app.mongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Utilizada para persistir no banco de dados.
*/
@Repository
public interface PostRepository extends MongoRepository<Post, String> {


    List<Post> findByTitleContaining(String text);

}
