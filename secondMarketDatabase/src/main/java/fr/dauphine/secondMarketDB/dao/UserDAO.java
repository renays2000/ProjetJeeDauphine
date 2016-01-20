/**
 * 
 */
package fr.dauphine.secondMarketDB.dao;

import org.springframework.data.repository.CrudRepository;

import fr.dauphine.secondMarketDB.model.User;

/**
 * @author gnepa.rene.barou
 *
 */
public interface UserDAO extends CrudRepository<User, Integer> {

	User findByLogin(String login);

	User findByEmail(String email);
}
