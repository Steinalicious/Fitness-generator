package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.User;
import project.persistence.repositories.UserRepository;
import project.service.SignUpService;


@Service
public class SignUpServiceImplementation implements SignUpService {

    // Instance Variables
    UserRepository repository;

    // Dependency Injection
    @Autowired
    public SignUpServiceImplementation(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
    
  /*  @Override
    public User findOne(Long id) {
    	return repository.findOne(id);
    }*/
}
