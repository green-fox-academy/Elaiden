package com.elaiden.redditclone.services;

import com.elaiden.redditclone.models.Post;
import java.util.List;

public interface PostServicable {

  List<Post> findAllPosts();
  void save(Post post);
  Post findPostById(long id);
  void findAndIncrement(long id);
  void findAndDecrement(long id);
  List<Post> showAllDescendingByPoints();
}
