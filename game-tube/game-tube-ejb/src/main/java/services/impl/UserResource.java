package services.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.User;

@Path("user")
public class UserResource extends UserManagement {

	/**
	 * @see UserManagement#UserManagement()
	 */
	public UserResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> hatElKoll() {
		return super.hatElKoll();
	}
}
