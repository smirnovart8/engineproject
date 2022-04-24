package main.controller;

import main.api.response.TagResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tag")
public class ApiTagController {

  @GetMapping("")
  private ResponseEntity<TagResponse> tagResponseResponseEntity() {
    return ResponseEntity.ok(new TagResponse());
  }

}
