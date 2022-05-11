package main.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "is_moderator")
  private boolean isModerator;

  @Column(name = "reg_time")
  private Date regTime;

  private String name;

  private String email;

  private String password;

  private String code;

  private String photo;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
  private Set<Post> posts;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
  private Set<PostComment> postComments;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
  private Set<PostVote> postVotes;

  public User(int id, boolean isModerator, Date regTime, String name, String email, String password,
      String code, String photo) {
    this.id = id;
    this.isModerator = isModerator;
    this.regTime = regTime;
    this.name = name;
    this.email = email;
    this.password = password;
    this.code = code;
    this.photo = photo;
  }

  public User() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isModerator() {
    return isModerator;
  }

  public void setModerator(boolean moderator) {
    isModerator = moderator;
  }

  public Date getRegTime() {
    return regTime;
  }

  public void setRegTime(Date regTime) {
    this.regTime = regTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public Set<Post> getPosts() {
    return posts;
  }

  public void setPosts(Set<Post> posts) {
    this.posts = posts;
  }

  public Set<PostComment> getPostComments() {
    return postComments;
  }

  public void setPostComments(Set<PostComment> postComments) {
    this.postComments = postComments;
  }

  public Set<PostVote> getPostVotes() {
    return postVotes;
  }

  public void setPostVotes(Set<PostVote> postVotes) {
    this.postVotes = postVotes;
  }
}
