package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.persistence.entities.Exercise;
import project.persistence.entities.Workout;
import project.service.ExerciseService;
import project.service.SignInService;
import project.service.StringManipulationService;
import project.service.WorkoutService;

@Controller
public class ChooseWorkoutController {
	
	private WorkoutService workoutService;
	private ExerciseService exerciseService;
	
    @Autowired
    public ChooseWorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }
    
    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/workout", so when the project
    // is running and you enter "localhost:8080/workout" into a browser, this
    // method is called
    @RequestMapping(value = "/choose", method = RequestMethod.GET)
    public String chooseViewGet(Workout workout, Model model){
    	
    	//model.addAttribute("workout", workoutService.findByName("Balance"));
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

    	System.out.println(mon.get(0).getExerciseID());

    	System.out.println(tue.get(0).getExerciseID());

    	System.out.println(wed.get(0).getExerciseID());

    	System.out.println(thu.get(0).getExerciseID());

    	System.out.println(fri.get(0).getExerciseID());
    	//Return the view
        return "workout/Choose";
    }
    
    @RequestMapping(value = "/choose", method = RequestMethod.POST)
    public String chooseViewPost(){

        
        // Return the view
        return "workout/Workout";
    }
}
