package com.ust.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.companies;
import com.ust.spring.repository.companyRepository;

@RestController
@RequestMapping("/companies")
public class companyController {
	@Autowired
	private companyRepository cr;
	
	
}
