package main.api.response;

import main.model.Tag;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class TagResponse
{
    private Set<Tag> tags;

}
