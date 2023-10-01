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
@RequestMapping("/user")
public class UserController {
		 @Autowired
		private UserRepository ur;
		 
		 @GetMapping
		 public List<User> readUser() {
			 List<User> temp=ur.findAll();
			 return temp;
		 }
		 
		 @GetMapping("/{id}")
		 public User readUserById(@PathVariable Integer id) {
			 Optional<User> temp=ur.findById(id);
			 User u=null;
			 if(temp.isPresent()) {
				 u=temp.get();
			 }
			 return u;
		 }
		 
		 @PostMapping
		 public User addUser(@RequestBody User u) {
			 ur.save(u);
			 return u;
		 }
		 
		 @PutMapping
		 public User updateUser(@RequestBody User u) {
			 User temp=readUserById(u.getId());
			 if(temp!=null) {
				 temp=u;
				 ur.save(temp);
			 }
			 return u;
		 }
		 
		 @DeleteMapping("/{id}")
		 public User DeleteUser(@PathVariable Integer id) {
			 User temp=readUserById(id);
			 if(temp!=null) {
				 ur.delete(temp);
			 }
			 return temp;
		 }

			

}
