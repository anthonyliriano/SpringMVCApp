package Application.controllers;

import Application.model.Post;
import Application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by aliriano on 7/18/17.
 */
@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/post/create")
    public String createPost(Model model){
        model.addAttribute("test", "This is just a Test.");

        model.addAttribute("Post", new Post());

        return "create_post";
    }

    @PostMapping("/post/submit")
    public String submitPost(@ModelAttribute("Post") Post post){
        String titleOfPost = post.getTitle();
        String authorOfPost = post.getAuthor();
        String contentOfPost = post.getContent();
        String votesOfPost =  "10";

        //Add Post
        postService.addPost(titleOfPost, authorOfPost, contentOfPost, votesOfPost);

        return "create_post";
    }
}

