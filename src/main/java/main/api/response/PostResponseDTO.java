package main.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
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


  public PostResponseDTO(int id, long timestamp, PostUserDTO postUserDTO, String tittle,
      String announce, int likeCount, int dislikeCount, int commentCount, int viewCount) {
    this.id = id;
    this.timestamp = timestamp;
    this.postUserDTO = postUserDTO;
    this.tittle = tittle;
    this.announce = announce;
    this.likeCount = likeCount;
    this.dislikeCount = dislikeCount;
    this.commentCount = commentCount;
    this.viewCount = viewCount;
  }
}
