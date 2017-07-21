package Application.repository;

import Application.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliriano on 7/19/17.
 */
@Component
public class PostRepository {

    List<Post> post = new ArrayList<Post>();


    public PostRepository(){
        //Manually created Posts.
        post.add(new Post("Post Number 1","Jack","Content_1","1"));
        post.add(new Post("Post Number 2","John","Content_2","0"));
        post.add(new Post("Post Number 3","Jenny","Content_3","10"));
        post.add(new Post("Post Number 4","Jim","Content_4","11"));
        post.add(new Post("Post Number 5","Joey","Content 5","0"));
        post.add(new Post("Post Number 6","Joey","Content 5","0"));
    }

    public List<Post> getAllPosts(){
        return post;
    }

    public void addPost(String title, String author, String content, String votes){
        post.add(new Post(title, author, content, votes));
    }


}
