/**
 * 
 */
package fr.dauphine.secondMarketDB.service;

import java.util.Collection;

import fr.dauphine.secondMarketDB.exception.BeanAlreadyExistException;
import fr.dauphine.secondMarketDB.exception.BeanNotExistException;
import fr.dauphine.secondMarketDB.model.User;

/**
 * @author gnepa.rene.barou
 *
 */
public interface UserManager {
	public void createUser(User user) throws BeanAlreadyExistException;

	public void deleteUser(User user) throws BeanNotExistException;

	public void updateUser(User user) throws BeanNotExistException;

	public User getUser(int id);

	public Collection<User> listUser();

	public User findByLogin(String login);

	public User findByEmail(String email);
	
	public Long count();
}
