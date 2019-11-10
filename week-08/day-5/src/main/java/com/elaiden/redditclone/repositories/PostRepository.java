package com.elaiden.redditclone.repositories;

import com.elaiden.redditclone.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM POST ORDER BY POST_SCORE DESC LIMIT ?1, ?2", nativeQuery = true)
  List<Post> findAllByOrderByPostScoreDesc(int start, int end);
}
