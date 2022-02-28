package main.controller;

import main.api.response.PostResponse;
import main.api.response.TagResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ApiPostController {

    @GetMapping("/post")
    private ResponseEntity<PostResponse> postResponseResponseEntity () {
        return new ResponseEntity<>(new PostResponse(), HttpStatus.OK);
    }

    @GetMapping("/tag")
    private ResponseEntity<TagResponse> tagResponseResponseEntity () {
        return new ResponseEntity<>(new TagResponse(), HttpStatus.OK);
    }
}
