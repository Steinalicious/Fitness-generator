package project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.persistence.entities.User;
import project.service.SignInService;

@Controller
public class SignInController {

    // Instance Variables
    private SignInService signinService;

    // Dependency Injection
    @Autowired
    public SignInController(SignInService signinService) {
        this.signinService = signinService;
    }
    // Method that returns the correct view for Sign up page
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String SignInViewGet(Model model){
    	
    	model.addAttribute("userSignIn",new User());
        // Return the view
   
        return "user/SignIn";
    }
    
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String SignInViewPost(@ModelAttribute("userSignIn") User userSignIn, HttpSession session, Model model){
    	//User user
    	String userName = userSignIn.getName();
    	String password = userSignIn.getPassword();
    	
    	User user = signinService.findOne(userName);
    	
    	if(user != null) {
    		if(user.getName().equals(userName) && user.getPassword().equals(password)) {
    			session.setAttribute("user", user);
    			return "profile/Profile";
    		}
    	}
    	
        // Return the view
        return "user/SignIn";
    }
    
}