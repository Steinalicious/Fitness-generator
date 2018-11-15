package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.User;
import project.service.UserService;

@Controller
public class UserController {

    // Instance Variables
    private UserService userService;

    // Dependency Injection
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Method that returns the correct view for Sign up page
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userViewGet(Model model){

        // Add a new User to the model for the form
        model.addAttribute("user",new User());

        // Return the view
        return "user/SignUp";
    }

    // Method that receives the POST request on the URL /user
    // and receives the ModelAttribute("user")
    // Here user data is saved 
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String userViewPost(@ModelAttribute("user") User user,
                                     Model model){

        // Save the User that we received from the form
        userService.save(user);
        
        //model.addAttribute("user", new User());
        
        // Return the view
        return "profile/Profile";
    }

}