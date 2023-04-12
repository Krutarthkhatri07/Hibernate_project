package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String name;
	
	@ManyToOne
	private Employee employee;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Laptop(int lid, String name, Employee employee) {
		super();
		this.lid = lid;
		this.name = name;
		this.employee = employee;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
