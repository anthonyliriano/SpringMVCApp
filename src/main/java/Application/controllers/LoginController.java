package Application.controllers;

import Application.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliriano on 7/22/17.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("User", new User());
        return "login";
    }
    @PostMapping("/login")
    public String autheticateUser(@ModelAttribute User user){
        System.out.println(user.getUsername());
        return "home";
    }
}
