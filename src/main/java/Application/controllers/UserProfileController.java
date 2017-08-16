package Application.controllers;

import Application.model.Post;
import Application.model.User;
import Application.services.PostService;
import Application.services.UserService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aliriano on 8/3/17.
 */
@Controller
public class UserProfileController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    //See User profile by UUID
    @GetMapping("/user/profile/{userID}")
    public String getUserProfile(@PathVariable("userID") String userID, Model model){

        User user = userService.getUserById(userID);
        if (user != null){
            model.addAttribute("User", user);

            //Get the posts for the user
            List<Post> userPosts = postService.getPostByUsername(user.getUsername());

            model.addAttribute("UserPost", userPosts);


            Path path = Paths.get("/Users/aliriano/user_avatars/");
            File f = path.toFile();

            for(int i = 0; i < f.listFiles().length; i++){
                //If the userID matches a picture.. load picture?
                if(FilenameUtils.getBaseName(Arrays.asList(f.listFiles()).get(i).getName()).equals(userID)){
                    System.out.println(Arrays.asList(f.listFiles()).get(i).getAbsolutePath());

                    model.addAttribute("profile_picture", Arrays.asList(f.listFiles()).get(i).getName());
                }else{
                    System.out.println("No image for user..using default image..");
                }
            }

            return "profile";
        }

        model.addAttribute("Error", "Trying to access a non-existing user");
        return "error";//Error page is user does not exist
    }


    //Retrieve the profile of the user who is logged in.
    @GetMapping("/user/profile/")
    public String getUserProfile(Model model, Principal principal){

        //Return User if found. Can't access this unless logged in
        User user = userService.getUserByUserName(principal.getName());

        model.addAttribute("User", user);

        //Get the posts for the user
        List<Post> userPosts = postService.getPostByUsername(user.getUsername());

        model.addAttribute("UserPost", userPosts);

        model.addAttribute("pic",new File("file:/Users/aliriano/user_avatars/"));

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
