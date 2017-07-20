package Application.services;

import Application.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aliriano on 7/19/17.
 */
@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public void getPost(){
        postRepository.getAllPosts();
    }
}
