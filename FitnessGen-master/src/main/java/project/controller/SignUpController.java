package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.User;
import project.service.SignUpService;

@Controller
public class SignUpController {

    // Instance Variables
    private SignUpService signupService;

    // Dependency Injection
    @Autowired
    public SignUpController(SignUpService signupService) {
        this.signupService = signupService;
    }

    // Method that returns the correct view for Sign up page
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUpViewGet(Model model){

        // Add a new User to the model for the form
        model.addAttribute("user",new User());

        // Return the view
        return "user/SignUp";
    }
    
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signUpViewPost(@ModelAttribute("user") User user, Model model){
    	//saves User to database
    	signupService.save(user);

        // Return the view
        return "Index";
    }
}