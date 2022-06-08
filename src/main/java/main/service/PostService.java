package main.service;

import java.util.ArrayList;
import java.util.List;
import main.api.response.PostListDTO;
import main.api.response.PostResponseDTO;
import main.api.response.PostUserDTO;
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

  public List<PostListDTO> getPostResponseDTOList(int offset, int limit, String mode) {

    List<Post> postList = new ArrayList<>(postRepository.findAll());
    List<PostResponseDTO> postResponseDTOList = new ArrayList<>();

    postList.forEach(s-> {
      postResponseDTOList.add(new PostResponseDTO(s.getId(), s.getTime(),
          new PostUserDTO(s.getUserId().getId(), s.getUserId().getName(), s.getTitle(), s.getText(),
          s.getPostVotes()) //todo
    });



  }
}
