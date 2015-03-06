package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.UserManagementLocal;
import domain.User;

/**
 * Session Bean implementation class UserManagement
 */
@Stateless
public class UserManagement implements UserManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserManagement() {
	}

	@Override
	public Boolean zidUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<User> hatElKoll() {
		return entityManager.createQuery("from User", User.class)
				.getResultList();
	}

	@Override
	public User jibBellesm(String name) {
		return entityManager.createNamedQuery("lawejBellesm", User.class)
				.setParameter("x", name).getSingleResult();
	}

}
