package project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {

    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchViewGet(Model model){
    	
    	//Methods to be implemented
    	
    	return null;
    }
    
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchViewPost(){

    	//Methods to be implemented
        
        // Return the view
        return null;
    }
}
