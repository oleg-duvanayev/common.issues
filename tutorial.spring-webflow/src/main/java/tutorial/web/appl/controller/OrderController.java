package tutorial.web.appl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import tutorial.web.appl.domain.Book;
import tutorial.web.appl.domain.Category;
import tutorial.web.appl.domain.OrderForm;
@Controller
public class OrderController {
	
	public OrderForm initializeForm(){
		OrderForm orderForm = new OrderForm();
		return orderForm;
	}
	
	public List<Category> initializeSelectableCategories(){
		ArrayList<Category> list = new ArrayList<>();
		list.add(new Category("fiction",100l));
		list.add(new Category("medicin",101l));
		list.add(new Category("technik",102l));
		return list;
	}
	
	public Map<Long, String> initializeSelectableBooks(OrderForm orderForm) {
		orderForm.getSelectedBooks().clear();
		orderForm.resetSelectedBooks();

		Map<Long, String> selectableBooks = new HashMap<Long, String>();
		Book book_1 = new Book("title_1",101l);
		Book book_2 = new Book("title_2",102l);
		
		selectableBooks.put(book_1.getId(), book_1.getTitle());
		selectableBooks.put(book_2.getId(), book_2.getTitle());

		return selectableBooks;
	}
}
