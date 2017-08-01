package Application.controllers;

import Application.model.Post;
import Application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
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
        Post post = new Post();
        model.addAttribute("Post", post);
        return "create_post";
    }

    @PostMapping("/post/submit/")
    public String submitPost(@Valid @ModelAttribute("Post") Post post, BindingResult bindingResult,
                             Model model, Principal principal){

        //When Post is submitted generate date.
       post.setLocalDateTime(post.generateDate());

       //Set Author as the user who is logged in..
        post.setAuthor(principal.getName());

        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getAllErrors());
            return "create_post";
        }else {
            //Add Post if there are no errors
            postService.addPost(post);
        }

        //Error on Home page unless this model attribute is passed..
        model.addAttribute("Post", postService.getPost());
        return "redirect:/";
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

