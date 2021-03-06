package Application.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by aliriano on 7/19/17.
 */
public class Post {

    @NotNull
    private UUID postId;

    private LocalDateTime localDateTime;

    @NotNull
    @Size(min = 5, max = 30)
    private String title;


    private String author;

    @NotNull
    @Size(min = 50, max = 400)
    private String content;

    private String votes;

    private String tags;

    public Post(){
    }
    public Post(UUID postId, LocalDateTime dateTime, String title, String author, String content, String votes, String tags){
        this.localDateTime = dateTime;
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
        this.votes = votes;
        this.tags = tags;
    }

    public UUID getPostId() {
        return postId;
    }

    public void setPostId(UUID postId) {
        this.postId = postId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    public UUID generateId(){
        return UUID.randomUUID();
    }
    public LocalDateTime generateDate(){
        return LocalDateTime.now();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
