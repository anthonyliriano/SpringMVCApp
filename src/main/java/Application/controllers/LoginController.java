package Application.controllers;

import Application.config.WebSecurityConfig;
import Application.model.User;
import Application.repository.UserRepository;
import Application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;


/**
 * Created by aliriano on 7/22/17.
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("User", new User());
        return "login";
    }

    @GetMapping("/logout")
    public String getLogoutPage(){
        return "redirect:/";
    }

    @PostMapping("/login/error")
    public String errorLoggingIn(Model model){

        Iterator<User> p =  userService.getAllUsers().iterator();
        while(p.hasNext()){
            System.out.println(p.next().getUsername());
        }
        //System.out.println(userDetailsService.loadUserByUsername("user"));

        model.addAttribute("User", new User());
        model.addAttribute("Error", "error");
        return "login";
    }

    @GetMapping("/register")
    public String registerUser(Model model){
        model.addAttribute("User", new User());
        return "register";
    }

    @PostMapping("/register/submit/")
    public String submitUserRegistration(@ModelAttribute("User") User user, @RequestParam("avatar")MultipartFile file) throws IOException{

        //Generate a Random UUID for this new user.
        user.setUserID(UUID.randomUUID().toString());

        userService.addUser(user);

        return "redirect:/";
    }
}
