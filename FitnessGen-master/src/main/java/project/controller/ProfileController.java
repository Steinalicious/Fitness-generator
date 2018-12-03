package project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.persistence.entities.User;

@Controller
public class ProfileController {
	
	
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profileViewGet(HttpSession session, Model model){   	
    	
    	//gets user from session
    	User user = (User) session.getAttribute("user");
    	model.addAttribute("user", user);
    	
    	//Return the view
        return "profile/Profile";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String signUpViewPost(@ModelAttribute("user") User user, Model model){

    	//Methods to be implemented
    	
        // Return the view
        return "profile/Profile";
    }
    
}
