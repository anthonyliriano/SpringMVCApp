package Application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by aliriano on 8/3/17.
 */
@Controller
public class UserProfileController {

    //Retrieve the profile of the user who is logged in.
    @GetMapping("/user/profile/")
    public String getUserProfile(){
        return "profile";
    }

    //Edit the profile of the user who is logged in.
    @GetMapping("/user/profile/edit/")
    public String editUserProfile(){
     return "edit_profile";
    }
}
