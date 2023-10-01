package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.ust.spring.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{   @Query(value="select * from employee where id>3",nativeQuery = true)
   List<Employee> greaterThanThree();
}