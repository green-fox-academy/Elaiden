package com.elaiden.redditclone.repositories;

import com.elaiden.redditclone.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAllByOrderByPostScoreDesc();
}
