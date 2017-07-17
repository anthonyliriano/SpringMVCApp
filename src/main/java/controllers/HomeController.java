package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliriano on 7/17/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(){
        return "home";
    }
}
