package domain.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.Encja.Book;
import io.swagger.v3.oas.annotations.servers.Server;
@Service
public class ServiceBook {
	
	
	
	public List<Book> addBookToList()
	{
		List<Book> Listbook = new ArrayList<>();
		Listbook.add(new Book("Mistrz","1112223334441"));
		Listbook.add(new Book("Twierdza","3212223334441"));
		Listbook.add(new Book("Mars","1402223334441"));
		Listbook.add(new Book("Mars","1144223334441"));
		return Listbook;
	}
}
