package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PostListDTO {

  private int count;

  @JsonProperty("posts")
  private List<PostResponseDTO> postList;

}
