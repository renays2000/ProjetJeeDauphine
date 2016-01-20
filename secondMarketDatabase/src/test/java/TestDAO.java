/**
 * 
 */



import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.dauphine.secondMarketDB.model.User;
import fr.dauphine.secondMarketDB.utils.HibernateUtils;

/**
 * @author gnepa.rene.barou
 *
 */
public class TestDAO {

	/**
	 * 
	 */
	public TestDAO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
		private static Session s = null;

		public static void main(String[] args) {
			// Ouverture d'une session Hibernate
			s = HibernateUtils.getSession();

			// Lancement des tests successifs
			testCreate();

			// Fermeture de la session Hibernate
			s.close();

	}
		private static void testCreate() {
			//Cr�ation des objets � rendre persistants
			User user1=new User("user1", "pass1", "user1@gmail.com");
			User user2=new User("user2", "pass2", "user2@gmail.com");
			User user3=new User("user3", "pass3", "user3@gmail.com");
			
			// Enregistrements
			Transaction tx = s.beginTransaction();
			s.persist(user1);
			s.persist(user2);
			s.persist(user3);
			
			tx.commit();
			
			// Affichage du contenu des tables
			printUsers();
		}
		@SuppressWarnings("unchecked")
		private static void printUsers() {
			System.out.println("---Users---");
			// Cr�ation de la requ�te
			Query q = s.createQuery("from User");		
			ArrayList<User> list = (ArrayList<User>) q.list();
			// Affichage de la liste de r�sultats
			for (User e: list) {
				System.out.println(e);
				System.out.println();
			}
		}

}
