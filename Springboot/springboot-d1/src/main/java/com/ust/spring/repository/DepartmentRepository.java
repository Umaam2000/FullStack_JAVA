package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.spring.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}