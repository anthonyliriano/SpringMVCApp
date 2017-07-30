package Application.controllers;

import Application.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/logout")
    public String getLogoutPage(){
        return "redirect:/";
    }
}
