package com.ust.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entiry.Product;
import com.ust.spring.service.productService;


@RestController
@RequestMapping
public class productController {
	
		@Autowired
		private productService ps;
		
		@GetMapping
		public List<Product> retrieveAllProducts() {
			return ps.read();
		}
		
		@GetMapping("/{id}")
		public Product findById(@PathVariable("id") Integer id) {
			Product pro = ps.read(id);
			
			return pro;
		}
		
		@PostMapping
		public Product addProduct(@RequestBody Product pro) {
			return ps.create(pro);
		}
		
		@PutMapping
		public Product updateProduct(@RequestBody Product pro) {
			return ps.update(pro);
		}
		
		@DeleteMapping("/{id}")
		public Product removeProduct(@PathVariable("id")Integer id) {
			return ps.delete(id);
		}
}
