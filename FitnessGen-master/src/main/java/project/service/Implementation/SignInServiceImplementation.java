package project.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.User;
import project.persistence.repositories.UserRepository;
import project.service.SignInService;

@Service
public class SignInServiceImplementation implements SignInService{

	UserRepository repository;
	
    @Autowired
    public SignInServiceImplementation(UserRepository repository) {
        this.repository = repository;
    }
	
	@Override
	public List<User> findByName(String name){
		return repository.findByName(name);
	}

	@Override
	public User findOne(String name) {
		return repository.findOne(name);
	}
	
}