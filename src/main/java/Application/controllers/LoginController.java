package Application.controllers;

import Application.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
