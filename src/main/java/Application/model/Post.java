package Application.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by aliriano on 7/19/17.
 */
public class Post {

    private UUID postId;

    @NotNull
    @Size(min = 5, max = 30)
    private String title;

    @NotNull
    @Size(min = 2, max = 30)
    private String author;

    @NotNull
    @Size(min = 50, max = 400)
    private String content;

    private String votes;

    public Post(){
    }
    public Post(UUID postId, String title, String author, String content, String votes){
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
        this.votes = votes;
    }

    public UUID getPostId() {
        return postId;
    }

    public void setPostId(UUID postId) {
        this.postId = postId;
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
}
