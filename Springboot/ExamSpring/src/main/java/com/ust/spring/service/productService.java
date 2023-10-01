package com.ust.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.spring.entiry.Product;
import com.ust.spring.repository.ProductRepository;

@Service
public class productService {

	@Autowired
	private ProductRepository pr;
	
	public Product create(Product pro) {
		return pr.save(pro);
	}
	
	public List<Product> read() {
		return pr.findAll();
	}
	
	public Product read(Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product idVal=null;
		if(temp.isPresent())
		{
			idVal=temp.get();
		}
		return idVal;
	}
	
	public Product update(Product pro) {
		Product proVal = read(pro.getId());
		if(proVal!=null)
		{
			proVal=pro;
			pr.save(proVal);
		}
		return proVal;
	}
	
	public Product delete(Integer id) {
		Product proVal = read(id);
		if(proVal!=null)
		{			
			pr.delete(proVal);
		}
		return proVal;
	}
}
