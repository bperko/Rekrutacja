package domain.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.hibernate.validator.constraints.Range;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.Encja.Book;
import domain.Service.ServiceBook;

@RestController
public class MainController {
//	List<Book> Listbook = new ArrayList<>();
	
	@Autowired
	ServiceBook servicebook;
	
	@GetMapping("/api/bookISBN/{ISBN}")
	public Book getBookByISBN(@PathVariable String ISBN)
	{
//		Listbook.add(new Book("Mistrz","1112223334441"));
//		Listbook.add(new Book("Twierdza","3212223334441"));
//		Listbook.add(new Book("Mars","1402223334441"));
		//response.addHeader("Spring", "jest super");
//		System.out.println("index");
		
		Book book = servicebook.addBookToList().stream().filter(x->x.getISBN().equals(ISBN)).findAny().get();
		return (Book) book;
	}
	
	@GetMapping("/api/bookName/{name}")
	public List<Book> FilterBookByName(@PathVariable String name)
	{
//		Listbook.add(new Book("Mistrz","1112223334441"));
//		Listbook.add(new Book("Twierdza","3212223334441"));
//		Listbook.add(new Book("Mars","1402223334441"));
		//response.addHeader("Spring", "jest super");
		System.out.println("index");
		List<Book> book = servicebook.addBookToList().stream().filter(x->x.getName().contains(name)).collect(Collectors.toList());
		return  book;
	}

}
