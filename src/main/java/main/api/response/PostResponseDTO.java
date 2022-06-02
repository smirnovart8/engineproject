package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import main.model.Post;
import main.service.PostService;
import org.springframework.stereotype.Component;

@Component
public class PostResponseDTO {

  private int id;
  private long timestamp;
  @JsonProperty("user")
  private PostUserDTO postUserDTO;
  private String tittle;
  private String announce;
  private int likeCount;
  private int dislikeCount;
  private int commentCount;
  private int viewCount;


}
