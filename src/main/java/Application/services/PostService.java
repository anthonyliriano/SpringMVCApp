package Application.services;

import Application.model.Post;
import Application.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by aliriano on 7/19/17.
 */
@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> getPost(){
      return postRepository.getAllPosts();

    }

    public void addPost(Post post){
        postRepository.addPost(post);

    }

    public Post getPostById(UUID postId){

       return postRepository.getPostById(postId);

    }

    //Get Posts by Username
    public List<Post> getPostByUsername(String username){
        List<Post> allPosts = postRepository.getAllPosts();
        List<Post> userSpecificPosts = new ArrayList<>();
        for (Post post : allPosts){
            if(post.getAuthor() == username){
                //add the post that contain the username to the userSpecificPosts List
                userSpecificPosts.add(post);
            }
        }
        return userSpecificPosts;
    }
}
