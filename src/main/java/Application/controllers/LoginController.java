package Application.controllers;

import Application.model.User;
import Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

//    @Autowired
//    UserRepository userRepository;

    @RequestMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("User", new User());
        return "login";
    }

    @RequestMapping("/logout")
    public String getLogoutPage(){
        return "redirect:/";
    }

    @RequestMapping("/login/error")
    public String errorLoggingIn(Model model){
        System.out.println("Whoops!");
        model.addAttribute("User", new User());

        model.addAttribute("Error", "error");
        return "login";
    }

    @RequestMapping("/register")
    public String registerUser(Model model){
        model.addAttribute("User", new User());
        return "register";
    }

    @PostMapping("/register/submit/")
    public String submitUserRegistration(@ModelAttribute("User") User user){
        System.out.println(user.getUsername());
       // userRepository.addUser(user);
        return "redirect:/";
    }
}
