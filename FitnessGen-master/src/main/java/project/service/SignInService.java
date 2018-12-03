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
	 
	 User findOne(String name);
		 

}
	