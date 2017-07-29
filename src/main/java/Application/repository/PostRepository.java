package Application.repository;

import Application.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by aliriano on 7/19/17.
 */
@Component
public class PostRepository {

    private List<Post> post = new ArrayList<Post>();


    public PostRepository(){
        //Manually created Posts.
        post.add(new Post(UUID.randomUUID(),"Post Number 1","Jack","Content_1","1"));
        post.add(new Post(UUID.randomUUID(),"Post Number 2","John","Content_2","0"));
        post.add(new Post(UUID.randomUUID(),"Post Number 3","Jenny","Content_3","10"));
        post.add(new Post(UUID.randomUUID(),"Post Number 4","Jim","Content_4","11"));
        post.add(new Post(UUID.randomUUID(),"Post Number 5","Joey","Content 5","0"));
        post.add(new Post(UUID.randomUUID(),"Post Number 6","Joey","Content 5","0"));
    }

    public List<Post> getAllPosts(){
        return post;
    }

    public void addPost(Post submittedPost){
        post.add(new Post(submittedPost.getPostId(),submittedPost.getTitle(),
                submittedPost.getAuthor(), submittedPost.getContent(), submittedPost.getVotes()));
    }

    public Post getPostById(UUID postId){

        //If UUID is found return Post..
        for(Post post : post){
            if(post.getPostId().toString().equals(postId.toString())){
                return post;
            }
        }
        return null;
    }


}
