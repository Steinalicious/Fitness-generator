package project.service.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Exercise;
import project.persistence.entities.Workout;
import project.persistence.repositories.ExerciseRepository;
import project.persistence.repositories.WorkoutRepository;
import project.service.ExerciseService;
import project.service.WorkoutService;

@Service
public class WorkoutServiceImplementation implements WorkoutService{

	WorkoutRepository repository;
	
    @Autowired
    public WorkoutServiceImplementation(WorkoutRepository repository) {
        this.repository = repository;
    }
	
	@Override
	public List<Workout> findByName(String name){
		return repository.findByName(name);
	}

	@Override
	public List<Workout> findAll() {
		return repository.findAll();
	}

	

}