package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name = "moderator_id")
    private User moderator;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    private Date time;

    private String title;

    private String text;

    @Column(name = "view_count")
    private int viewCount;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostComment> postComments;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostVote> postVotes;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable (name = "tag2post",
    joinColumns = {@JoinColumn (name = "post_id")},
    inverseJoinColumns = {@JoinColumn(name ="tag_id")}
    )
    private List<Tag> postTags;


    public Post(int id, boolean isActive, ModerationStatusType moderationStatus, User moderator, User user, Date time, String title, String text) {
        this.id = id;
        this.isActive = isActive;
        this.moderationStatus = moderationStatus;
        this.moderator = moderator;
        this.user = user;
        this.time = time;
        this.title = title;
        this.text = text;
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

    public User getModeratorId() {
        return moderator;
    }

    public void setModeratorId(User moderator) {
        this.moderator = moderator;
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

    public List<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComment> postComments) {
        this.postComments = postComments;
    }

    public List<PostVote> getPostVotes() {
        return postVotes;
    }

    public void setPostVotes(List<PostVote> postVotes) {
        this.postVotes = postVotes;
    }
}
