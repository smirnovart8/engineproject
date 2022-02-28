package main.api.response;

import main.model.Post;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class PostResponse
{
    private Set<Post> posts;
}
