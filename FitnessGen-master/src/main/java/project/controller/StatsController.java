package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.service.StringManipulationService;

@Controller
public class StatsController {

    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/stats", so when the project
    // is running and you enter "localhost:8080/stats" into a browser, this
    // method is called
    @RequestMapping(value = "/stats", method = RequestMethod.GET)
    public String statsViewGet(){

    	//Return the view
        return "stats/Stats";
    }
}
