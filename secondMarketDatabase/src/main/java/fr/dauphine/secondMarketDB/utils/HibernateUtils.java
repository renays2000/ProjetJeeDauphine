/**
 * 
 */
package fr.dauphine.secondMarketDB.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author gnepa.rene.barou
 *
 */
public class HibernateUtils {

	/**
	 * 
	 */
	public HibernateUtils() {
		// TODO Auto-generated constructor stub
	}

	private static final SessionFactory sessionFactory;

	// Crée une unique instance de la SessionFactory à partir de
	// hibernate.cfg.xml
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (HibernateException ex) {
			throw new RuntimeException("Problème de configuration : "
					+ ex.getMessage(), ex);
		}
	}

	// Renvoie une session Hibernate
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}
}
