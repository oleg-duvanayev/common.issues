package tutorial.web.domain;

import java.io.Serializable;

public class ContactForm implements Serializable {
	private String name;
	private String surname;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ContactForm [name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
}
