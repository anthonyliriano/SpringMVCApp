package Application.model;

import org.springframework.stereotype.Component;

/**
 * Created by aliriano on 7/19/17.
 */
public class Post {
    private String title;
    private String author;
    private String content;
    private String votes;

    public Post(String title, String author, String content, String votes){
        this.title = title;
        this.author = author;
        this.content = content;
        this.votes = votes;
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
