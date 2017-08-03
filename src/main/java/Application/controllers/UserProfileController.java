package Application.controllers;

import Application.model.User;
import Application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;

/**
 * Created by aliriano on 8/3/17.
 */
@Controller
public class UserProfileController {

    @Autowired
    UserService userService;

    //See User profile by UUID
    @GetMapping("/user/profile/{userID}")
    public String getUserProfile(@PathVariable("userID") String userID, Model model){

        User user = userService.getUserById(userID);
        if (user != null){
            model.addAttribute("User", user);
            return "profile";
        }

        //Error Page if user does not exist.
        model.addAttribute("Error", "Trying to access a non-existing user");
        return "error";
    }


    //Retrieve the profile of the user who is logged in.
    @GetMapping("/user/profile/")
    public String getUserProfile(Model model, Principal principal){

        //Return User if found.
        User user = userService.getUserByUserName(principal.getName());

        model.addAttribute("User", user);

        return "profile";
    }

    //Edit the profile of the user who is logged in.
    @GetMapping("/user/profile/edit/")
    public String editUserProfile(Model model, Principal principal){

        //Return User if found.
        User user = userService.getUserByUserName(principal.getName());

        model.addAttribute("User", user);
     return "edit_profile";
    }

}
