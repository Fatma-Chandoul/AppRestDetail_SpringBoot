package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String role;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String role, int id ) {
		super();
		this.role = role;
		this.id=id;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}
	

}

