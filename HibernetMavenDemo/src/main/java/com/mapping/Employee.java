package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String name;
	
	@OneToMany(mappedBy = "employee")
	private List<Laptop> laptops;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Employee(int eid, String name, List<Laptop> laptops) {
		super();
		this.eid = eid;
		this.name = name;
		this.laptops = laptops;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
