package util;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import services.interfaces.UserManagementLocal;
import domain.User;

/**
 * Session Bean implementation class DBPopulator
 */
@Singleton
@Startup
public class DBPopulator {

	@EJB
	private UserManagementLocal userManagementLocal;

	/**
	 * Default constructor.
	 */
	public DBPopulator() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void populate() {

		User user = new User("rimka");
		User user2 = new User("dal");

		userManagementLocal.zidUser(user);
		userManagementLocal.zidUser(user2);

	}

}
