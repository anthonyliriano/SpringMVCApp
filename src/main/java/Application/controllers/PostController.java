package Application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliriano on 7/18/17.
 */
@Controller
public class PostController {

    @RequestMapping("/createpost")
    public String createPost(){
        return "create_post";
    }
}

