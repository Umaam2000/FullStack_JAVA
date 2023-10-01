package com.ust.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	 @Autowired
	private BookRepository br;
	 
	 @GetMapping
	 public List<Book> readBook() {
		 List<Book> temp=br.findAll();
		 return temp;
	 }
	 
	 @GetMapping("/{id}")
	 public Book readBookById(@PathVariable Integer id) {
		 Optional<Book> temp=br.findById(id);
		 Book b=null;
		 if(temp.isPresent()) {
			 b=temp.get();
		 }
		 return b;
	 }
	 
	 @PostMapping
	 public Book addBook(@RequestBody Book b) {
		 br.save(b);
		 return b;
	 }
	 
	 @PutMapping
	 public Book updateBook(@RequestBody Book b) {
		 Book temp=readBookById(b.getId());
		 if(temp!=null) {
			 temp=b;
			 br.save(temp);
		 }
		 return b;
	 }
	 
	 @DeleteMapping("/{id}")
	 public Book DeleteBook(@PathVariable Integer id) {
		 Book temp=readBookById(id);
		 if(temp!=null) {
			 br.delete(temp);
		 }
		 return temp;
	 }

		

}
