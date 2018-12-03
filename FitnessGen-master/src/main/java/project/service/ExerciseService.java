package project.service;

import java.util.List;
import project.persistence.entities.Exercise;
import project.persistence.entities.User;

public interface ExerciseService{
	

	List<Exercise> findByName(String name);
	
	Exercise findOne(Long id);
}