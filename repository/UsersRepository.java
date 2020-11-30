package repository;

import java.util.List;
import model.users.User;

/**
 * Repository that should contain all the app users.
 * 
 * Specify methods used in the user interface.
 * 
 * @author Bernat Galmés Rubert
 */
public interface UsersRepository {

    /**
     * Find a user in the repository with the specified id.
     * 
     * @param id Identifier of the user searched
     * @return The user with the specified id
     * 
     * @throws repository.UsersRepository.NotFoundException 
     */
    User findOne(long id) throws NotFoundException;

    /**
     * Get all users in the repository.
     * 
     * @return  A list with All users in the repository
     */
    List<User> findAll();
    
    /**
     * Get the mean number of access of each user class.
     * 
     * Return an array where the first cell contains the mean access of arbitres,
     * the second of socis, and the third of Jugadors.
     * 
     * @return An array with the access of each user class.
     */
    float[] meanAccessByClass();
    
    /**
     * Get the name of the user with more acess.
     * 
     * @return 
     */
    String findUserWithMaxAccess();
    
    /**
     * Find the names of the users that never has accessed to the app.
     * 
     * @return 
     */
    List<String> findUsersWithNoAccess();
    
    /**
     * Get the name of the user with more wins.
     * 
     * @return 
     */
    String findUserWithMaxWins();
    
    static class NotFoundException extends Exception {}
}
