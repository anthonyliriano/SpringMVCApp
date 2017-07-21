package Application.services;

import Application.model.Post;
import Application.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void addPost(String title, String author, String content, String votes){
        postRepository.addPost(title, author, content, votes);
    }
}
