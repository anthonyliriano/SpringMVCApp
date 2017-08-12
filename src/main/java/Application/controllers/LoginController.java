package Application.controllers;

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
import java.util.UUID;


/**
 * Created by aliriano on 7/22/17.
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

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
        System.out.println("Whoops!");
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

        //Multipart file
        Path path = Paths.get("/Users/aliriano/Desktop/springMVCapp/src/main/profile_pictures/",file.getOriginalFilename());
        Files.write(path, file.getBytes());
        
        return "redirect:/";
    }
}
