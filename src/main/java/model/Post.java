package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "is_active")
    private boolean isActive;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum", name = "moderation_status")
    private ModerationStatusType moderationStatus;

    @Column(name = "moderator_id")
    private int moderatorId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    private Date time;

    private String title;

    private String text;

    @Column(name = "view_count")
    private int viewCount;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Set<PostComment> postComments;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Set<PostVote> postVotes;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable (name = "tag2post",
    joinColumns = {@JoinColumn (name = "post_id")},
    inverseJoinColumns = {@JoinColumn(name ="tag_id")})
    private Set<Tag> tags;

    public Post(int id, boolean isActive, ModerationStatusType moderationStatus, int moderatorId, User user, Date time, String title, String text) {
        this.id = id;
        this.isActive = isActive;
        this.moderationStatus = moderationStatus;
        this.moderatorId = moderatorId;
        this.user = user;
        this.time = time;
        this.title = title;
        this.text = text;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(int moderatorId) {
        this.moderatorId = moderatorId;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public ModerationStatusType getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(ModerationStatusType moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    public Set<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(Set<PostComment> postComments) {
        this.postComments = postComments;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<PostVote> getPostVotes() {
        return postVotes;
    }

    public void setPostVotes(Set<PostVote> postVotes) {
        this.postVotes = postVotes;
    }

}
