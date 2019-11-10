package com.elaiden.redditclone.services;

import com.elaiden.redditclone.models.Post;
import com.elaiden.redditclone.repositories.PostRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostServicable {

  private PostRepository postRepository;

  @Autowired
  public PostServiceImp(PostRepository postRepository) {
    this.postRepository = postRepository;
  }


  @Override
  public void save(Post post) {
    postRepository.save(post);
  }

  @Override
  public Post findPostById(long id) {
    return postRepository.findById(id).orElse(null);
  }

  @Override
  public void findAndIncrement(long id) {
    Post post;
    post = findPostById(id);
    if (post != null) {
      post.upVote();
    }
    postRepository.save(post);
  }

  @Override
  public void findAndDecrement(long id) {
    Post post;
    post = findPostById(id);
    if (post != null) {
      post.downVote();
    }
    postRepository.save(post);
  }

  @Override
  public List<Post> showAllDescendingPerPage(int page) {
    return new ArrayList<>(
        postRepository.findAllByOrderByPostScoreDesc((page - 1) * 10, page * 10));
  }
}
