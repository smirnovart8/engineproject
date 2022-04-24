package main.service;

import java.util.List;
import main.model.Post;
import main.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private final PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> posts() {

    return postRepository.findAll();
  }
}
