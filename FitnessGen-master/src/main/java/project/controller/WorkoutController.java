package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






@Controller
public class WorkoutController {
    
    @RequestMapping(value = "/workout", method = RequestMethod.GET)
    public String workoutViewGet(Model model){
    
    	//Methods to be implemented
    	
    	//Return the view
        return "workout/Workout";
    }
    
    @RequestMapping(value = "/workout", method = RequestMethod.POST)
    public String workoutViewPost(){

    	//Methods to be implemented
    	
        // Return the view
        return "workout/Workout";
    }
}
