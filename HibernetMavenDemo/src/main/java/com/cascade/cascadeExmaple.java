package com.cascade;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.Employee;
import com.mapping.Laptop;

public class cascadeExmaple {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setName("krutarth");
		
		Laptop l1=new Laptop();
		l1.setLid(123);
		l1.setName("Dell");
		l1.setEmployee(e1);
		
		Laptop l2=new Laptop();
		l2.setLid(456);
		l2.setName("HP");
		l2.setEmployee(e1);
		
		Laptop l3=new Laptop();
		l3.setLid(789);
		l3.setName("Apple");
		l3.setEmployee(e1);
		
		
		s.close();
		factory.close();

	}

}
