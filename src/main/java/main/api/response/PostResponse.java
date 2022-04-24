package main.api.response;

import java.util.List;
import main.model.Post;
import main.service.PostService;
import org.springframework.stereotype.Component;

@Component
public class PostResponse {

  private final PostService postService;

  public PostResponse(PostService postService) {
    this.postService = postService;
  }

  private List<Post> getPosts() {
    return postService.posts();
  }

  ;


}
