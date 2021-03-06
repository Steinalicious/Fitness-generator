package project.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.persistence.entities.User;


/**
 * By extending the {@link JpaRepository} we have access to powerful methods.
 * For detailed information, see:
 * http://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
 * http://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	//Save user in repo
    User save(User user);
    
    //Deletes user in repo
    void delete(User user);
    
    List<User> findByName(String name);
    
    @Query(value = "SELECT u FROM User u WHERE u.name = ?1")
    User findOne(String name);
    
    

}
