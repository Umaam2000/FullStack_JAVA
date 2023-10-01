package com.ust.spring;

//import com.example.test.model.Book;
//import com.example.test.model.User;
//import com.example.test.repository.BookRepository;
//import com.example.test.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping
public class LibraryController {
    @Autowired
    private BookRepository br;
    @Autowired
    private UserRepository ur;
    
    @PostMapping("/addbook")
    public ResponseEntity<Book> create(@RequestBody Book book){
    	br.save(book);
        return ResponseEntity.ok().body(book);
    }
    @PostMapping("/adduser")
    public ResponseEntity<User> createUser(@RequestBody User user){
    	ur.save(user);
        return ResponseEntity.ok().body(user);
    }
    
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Long id){
    	Optional<Book>temp=br.findById(id);
    	Book book=null;
    	if(temp.isPresent()) {
    		book=temp.get();
    		return ResponseEntity.ok().body(book);
    	}
    	return ResponseEntity.noContent().build();
        }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
    	Optional<User>temp=ur.findById(id);
    	User user=null;
    	if(temp.isPresent()) {
    		user=temp.get();
    		
    		return ResponseEntity.ok().body(user);
    	}
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateDetails(@RequestBody Book book, @PathVariable long id){
    		Optional<Book>temp=br.findById(id);
    		Book b=null;
    		if(temp!=null) {
    			b=book;
    			br.save(b);
    			return ResponseEntity.ok().body(b);
    		}
    		
            return ResponseEntity.noContent().build();
       }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Boolean> deleteBook(@PathVariable long id){
        	Optional<Book>temp=br.findById(id);
        	Book b=null;
        	if(temp!=null) {
        		b=temp.get();
        		br.delete(b);
        		return ResponseEntity.ok(true);
        	}
          return ResponseEntity.ok(false);

    }}
