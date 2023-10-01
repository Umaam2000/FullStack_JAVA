package com.ust.spring.entiry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer cost;
	
	public Product() {
		
	}
	
	public Product(Integer id, String name, Integer cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
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

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	
}
