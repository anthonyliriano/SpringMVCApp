package Application.controllers;

import Application.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliriano on 7/18/17.
 */
@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/createpost")
    public String createPost(Model model){
        model.addAttribute("test", "This is just a Test.");
        postService.getPost();
        return "create_post";
    }
}

