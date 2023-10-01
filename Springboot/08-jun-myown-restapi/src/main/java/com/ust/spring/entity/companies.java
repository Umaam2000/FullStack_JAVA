package com.ust.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class companies {
	@Id
	private Integer id;
	private String name;
	private Integer employeeStrength;
	
	public companies() {
		
	}
	
	public companies(Integer id, String name, Integer employeeStrength) {
		super();
		this.id = id;
		this.name = name;
		this.employeeStrength = employeeStrength;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeStrength() {
		return employeeStrength;
	}
	public void setEmployeeStrength(Integer employeeStrength) {
		this.employeeStrength = employeeStrength;
	}

	@Override
	public String toString() {
		return "companies [id=" + id + ", name=" + name + ", employeeStrength=" + employeeStrength + "]";
	}
	
	
	
	
}
