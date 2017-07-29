package Application.controllers;

import Application.model.Post;
import Application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.UUID;

/**
 * Created by aliriano on 7/18/17.
 */
@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/post/create/")
    public String createPost(Model model){
        model.addAttribute("Post", new Post());

        return "create_post";
    }

    @PostMapping("/post/submit/")
    public String submitPost(@Valid @ModelAttribute("Post") Post post, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getAllErrors());
            return "create_post";
        }else {
            UUID postId = UUID.randomUUID();
            post.setPostId(postId);
            //Add Post if there are no errors
            postService.addPost(post);
        }

        //Error on Home page unless this model attribute is passed..
        model.addAttribute("Post", postService.getPost());
        return "home";
    }

    @RequestMapping("/post/view/{postId}")
    public String viewPost(@PathVariable("postId") UUID postId, Model model){

        Post post = postService.getPostById(postId);

        if (post != null){
            model.addAttribute("Post", post);
        }

        return "view_post";
    }
}

