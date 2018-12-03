package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.persistence.entities.Exercise;
import project.service.ExerciseService;
import project.service.SignInService;
import project.service.StringManipulationService;

@Controller
public class SearchController {

    
    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/workout", so when the project
    // is running and you enter "localhost:8080/workout" into a browser, this
    // method is called
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchViewGet(Model model){
    	
    	
    	return null;
    }
    
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchViewPost(){

        
        // Return the view
        return null;
    }
}
