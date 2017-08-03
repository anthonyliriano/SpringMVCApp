package Application.controllers;

import Application.services.PostService;
import Application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliriano on 7/17/17.
 */
@Controller
public class HomeController {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("Post", postService.getPost());
        model.addAttribute("PostCreator", userService);
        return "home";
    }
}
