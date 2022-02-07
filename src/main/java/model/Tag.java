package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;



    @OneToMany (cascade = CascadeType.ALL, mappedBy = "tag")
    private List<TagToPost> tagToPosts;


    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TagToPost> getTagToPosts() {
        return tagToPosts;
    }

    public void setTagToPosts(List<TagToPost> tagToPosts) {
        this.tagToPosts = tagToPosts;
    }
}
