package fr.alexyvanot.secuwebapi.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int userID;
	private String lastName;
	private String firstName;

	public void setIdUser(int userID) {
		this.userID = userID;
	}

	public int getIdUser() {
		return userID;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

}
