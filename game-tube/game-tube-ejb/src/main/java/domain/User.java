package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@NamedQuery(name="lawejBellesm",query="select u From User u where u.name=:x")
public class User implements Serializable {

	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	public User() {
	}

	public User( String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
