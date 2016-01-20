/**
 * 
 */
package fr.dauphine.secondMarketDB.service.impl;

import java.util.Collection;

import fr.dauphine.secondMarketDB.dao.UserDAO;
import fr.dauphine.secondMarketDB.exception.BeanAlreadyExistException;
import fr.dauphine.secondMarketDB.exception.BeanNotExistException;
import fr.dauphine.secondMarketDB.model.User;
import fr.dauphine.secondMarketDB.service.UserManager;

/**
 * @author gnepa.rene.barou
 *
 */
public class UserManagerImpl implements UserManager {
	private UserDAO userDao;

	/**
	 * 
	 */
	public UserManagerImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.dauphine.secondMarket.service.UserManager#createUser(fr.dauphine.secondMarket.model.User)
	 */
	public void createUser(User user) throws BeanAlreadyExistException {
		userDao.save(user);

	}

	/* (non-Javadoc)
	 * @see fr.dauphine.secondMarket.service.UserManager#deleteUser(fr.dauphine.secondMarket.model.User)
	 */
	public void deleteUser(User user) throws BeanNotExistException {
		userDao.delete(user);
	}

	/* (non-Javadoc)
	 * @see fr.dauphine.secondMarket.service.UserManager#updateUser(fr.dauphine.secondMarket.model.User)
	 */
	public void updateUser(User user) throws BeanNotExistException {
		userDao.save(user);

	}

	/* (non-Javadoc)
	 * @see fr.dauphine.secondMarket.service.UserManager#getUser(int)
	 */
	public User getUser(int id) {
		return userDao.findOne( id);
	}

	/* (non-Javadoc)
	 * @see fr.dauphine.secondMarket.service.UserManager#listUser()
	 */
	public Collection<User> listUser() {
		return  (Collection<User>) userDao.findAll();
	}

	/**
	 * @return the userDao
	 */
	public UserDAO getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public User findByLogin(String login) {
		// TODO Auto-generated method stub
		return userDao.findByLogin(login);
	}

	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.findByEmail(email);
	}

	public Long count() {
		// TODO Auto-generated method stub
		return userDao.count();
	}

}
