package project.service;

import java.util.List;

import project.persistence.entities.User;

public interface SignInService {

    /**
     * Save a {@link User}
     * @param user {@link User} to be saved
     * @return {@link User} that was saved
     */
	 List<User> findByName(String name);
	 /**
	  * Find One {@link name}
	  * @param name {@link name} to be found
	  * @return {@link User} that was Fpund
	  */
	 User findOne(String name);
		 

}
	