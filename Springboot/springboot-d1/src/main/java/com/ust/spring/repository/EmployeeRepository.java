package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ust.spring.service.EmployeeService;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeService, Integer>{

}