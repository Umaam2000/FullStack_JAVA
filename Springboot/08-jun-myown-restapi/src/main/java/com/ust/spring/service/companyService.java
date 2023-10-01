//package com.ust.spring.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ust.spring.entity.companies;
//import com.ust.spring.repository.companyRepository;
//import java.util.Optional;
//
//@Service
//public class companyService {
//	@Autowired
//	private companyRepository cs;
//	
//	public companies create(companies c) {
//		return cs.save(c);
//	}
//	public List<companies> read() {
//		return cs.findAll();
//	}
//	public companies read(Integer id) {
//		Optional<companies> temp=cs.findById(id);
//		companies c=null;
//		if(temp.isPresent()) {
//			c=temp.get();
//		}
//		
//		return c;
//		
//	}
//	public companies update(companies c) {
//		companies temp=read(c.getId());
//		if(temp!=null) {
//			temp=c;
//			cs.save(temp);
//		}
//		return temp;
//	}
//	public companies Delete(Integer id) {
//		companies temp=read(id);
//		if(temp!=null) {
//			cs.delete(temp);
//		}
//		return temp;
//	}
//	
//
//}
