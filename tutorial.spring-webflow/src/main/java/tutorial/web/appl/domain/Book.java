package tutorial.web.appl.domain;

public class Book {
	private String title;
	private Long id;

	public Book() {
		this(null,null);
	}
	
	public Book(String title, Long id) {
		super();
		this.title = title;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
