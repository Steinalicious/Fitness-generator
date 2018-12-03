package project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.persistence.entities.User;
import project.service.StringManipulationService;

@Controller
public class ProfileController {
	
	

    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/profile", so when the project
    // is running and you enter "localhost:8080/profile" into a browser, this
    // method is called
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profileViewGet(HttpSession session, Model model){   	
    	
    	User user = (User) session.getAttribute("user");
    	model.addAttribute("user", user);
    	
    	
    	//Return the view
        return "profile/Profile";
    }
    
    // Method that receives the POST request on the URL /user
    // and receives the ModelAttribute("user")
    // Here user data is saved 
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String signUpViewPost(@ModelAttribute("user") User user,
                                     Model model){

        // Save the User that we received from the form
         
        //model.addAttribute("user", new User());
        
        // Return the view
        return "profile/Profile";
    }
    
}
