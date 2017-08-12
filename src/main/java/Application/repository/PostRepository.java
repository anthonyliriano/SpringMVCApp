package Application.repository;

import Application.model.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
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
        //Manually created Post.
        post.add(new Post(UUID.randomUUID(),LocalDateTime.now().minusMinutes(220),
                "Test Post",
                "user",
                "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a",
                "18",
                "test,test"));
    }

    public List<Post> getAllPosts(){
        return post;
    }

    public void addPost(Post submittedPost){
        post.add(new Post(submittedPost.getPostId(), submittedPost.getLocalDateTime(),submittedPost.getTitle(),
                submittedPost.getAuthor(), submittedPost.getContent(), submittedPost.getVotes(), submittedPost.getTags()));
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
