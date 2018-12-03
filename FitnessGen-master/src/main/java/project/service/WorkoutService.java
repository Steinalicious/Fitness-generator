package project.service;

import java.util.List;

import project.persistence.entities.Workout;

public interface WorkoutService{
	
	List<Workout> findByName(String name);
	
	List<Workout> findAll();
}