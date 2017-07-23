package Application.controllers;

import Application.model.Post;
import Application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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
        model.addAttribute("Post", new Post());

        return "create_post";
    }

    @PostMapping("/post/submit")
    public String submitPost(@Valid @ModelAttribute("Post") Post post, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getAllErrors());
            return "create_post";
        }else {
            //Add Post if there are no errors
            postService.addPost(post);
        }

        //Error on Home page unless this model is passed..
        model.addAttribute("Post", postService.getPost());
        return "home";
    }
}

