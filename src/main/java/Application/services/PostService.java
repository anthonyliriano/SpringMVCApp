package Application.services;

import Application.model.Post;
import Application.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
