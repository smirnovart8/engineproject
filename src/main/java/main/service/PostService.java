package main.service;

import java.util.List;
import main.api.response.PostResponseDTO;
import main.model.Post;
import main.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private List<PostResponseDTO> postResponseDTOList;

  @Autowired
  private PostRepository postRepository;


  public Post getPost(int id) {
    return postRepository.getById(id);
  }

  public List<PostResponseDTO> getPostResponseDTOList(int offset, int limit, String mode) {

    postRepository
    return postRepository. //todo
  }
}
