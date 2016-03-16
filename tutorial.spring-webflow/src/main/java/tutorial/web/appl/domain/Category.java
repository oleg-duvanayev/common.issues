package tutorial.web.appl.domain;

import java.io.Serializable;

public class Category implements Serializable{
	private String name;
	private Long id;
	
	public Category() {
		this(null,null);
	}
	
	public Category(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
