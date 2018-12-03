package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.persistence.entities.Workout;
import project.service.WorkoutService;

@Controller
public class ChooseWorkoutController {
	
	private WorkoutService workoutService;
	
    @Autowired
    public ChooseWorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }
    
    @RequestMapping(value = "/choose", method = RequestMethod.GET)
    public String chooseViewGet(Workout workout, Model model){
    	
    	List<Workout> mon = workoutService.findByName("Mon");
    	List<Workout> tue = workoutService.findByName("Tue");
    	List<Workout> wed = workoutService.findByName("Wed");
    	List<Workout> thu = workoutService.findByName("Thu");
    	List<Workout> fri = workoutService.findByName("Fri");
    	
    	model.addAttribute("mon", mon);
    	model.addAttribute("tue", tue);
    	model.addAttribute("wed", wed);
    	model.addAttribute("thu", thu);
    	model.addAttribute("fri", fri);

    	
    	//incorrect Implementation Fix up needed
    	
    	//Return the view
        return "workout/Choose";
    }
    
    @RequestMapping(value = "/choose", method = RequestMethod.POST)
    public String chooseViewPost(){
    	
    	//Methods to be implemented

        
        // Return the view
        return "workout/Workout";
    }
}
