package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class oneTomanyMappingDemo {

	public static void main(String[] args) {
		
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
		
		List<Laptop> list=new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		e1.setLaptops(list);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(l1);
		session.save(l2);
		session.save(l3);
		
		session.getTransaction().commit();
		
		//fetching data
		
		Employee em=(Employee)session.get(Employee.class, 1);
		System.out.println("employee name:"+em.getName());
		for (Laptop laptop : em.getLaptops()) {
			System.out.println("laptop name:"+laptop.getName());
		}
		
		
		
		session.close();
		System.out.println("done....");  
		

	}

}
