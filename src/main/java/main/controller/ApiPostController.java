package main.controller;

import main.api.response.PostResponseDTO;
import main.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiPostController {

  private final PostService postService;

  public ApiPostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/post")
  private ResponseEntity<PostResponseDTO> postResponseResponseEntity() {
    return ResponseEntity.ok(new PostResponseDTO(postService));
  }


}
