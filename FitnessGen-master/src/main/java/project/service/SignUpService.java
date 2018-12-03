package project.service;

import project.persistence.entities.User;


public interface SignUpService {

    /**
     * Save a {@link User}
     * @param user {@link User} to be saved
     * @return {@link User} that was saved
     */
    User save(User user);

    /**
     * Delete {@link User}
     * @param user {@link User} to be deleted
     */
    void delete(User user);
    
    
   // User findOne(Long id);

}