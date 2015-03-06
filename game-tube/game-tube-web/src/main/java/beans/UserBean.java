package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import services.interfaces.UserManagementLocal;
import domain.User;

@ManagedBean
@ViewScoped
public class UserBean implements Serializable{
	@EJB
	private UserManagementLocal userManagementLocal;
	private List<User> users;

	public UserBean() {
	}

	@PostConstruct
	public void init() {
		users = userManagementLocal.hatElKoll();
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
