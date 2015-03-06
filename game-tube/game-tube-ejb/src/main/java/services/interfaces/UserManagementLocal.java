package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.User;

@Local
public interface UserManagementLocal {
	Boolean zidUser(User user);

	List<User> hatElKoll();

	User jibBellesm(String name);

}
