package com.elaiden.redditclone.services;

import com.elaiden.redditclone.models.Post;
import java.util.List;

public interface PostServicable {

  void save(Post post);
  Post findPostById(long id);
  void findAndIncrement(long id);
  void findAndDecrement(long id);
  List<Post> showAllDescendingPerPage(int page);
}
