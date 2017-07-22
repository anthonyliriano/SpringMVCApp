package Application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aliriano on 7/22/17.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}
