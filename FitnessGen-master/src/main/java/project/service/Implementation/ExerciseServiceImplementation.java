package project.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Exercise;
import project.persistence.repositories.ExerciseRepository;
import project.service.ExerciseService;

@Service
public class ExerciseServiceImplementation implements ExerciseService{

	ExerciseRepository repository;
	
    @Autowired
    public ExerciseServiceImplementation(ExerciseRepository repository) {
        this.repository = repository;
    }
	
	@Override
	public List<Exercise> findByName(String name){
		return repository.findByName(name);
	}

	@Override
	public Exercise findOne(Long id) {
		return repository.findOne(id);
	}
}