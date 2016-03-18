package tutorial.web.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class EmailGroupForm implements Serializable {
	private int id=-1;
	private String title;
	private Collection<ContactForm> contacts = new ArrayList<>();
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Collection<ContactForm> getContacts() {
		return contacts;
	}

	public void setContacts(Collection<ContactForm> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "EmailGroupForm [id=" + id + ", title=" + title + ", total contacts=" + contacts.size() + "]";
	}

}
