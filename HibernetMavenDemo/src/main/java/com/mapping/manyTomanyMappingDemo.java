package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class manyTomanyMappingDemo {

	public static void main(String[] args) {
		
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setEid(34);
		e1.setName("ram");
		
		e2.setEid(35);
		e2.setName("shaym");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setPid(12121);
		p1.setProjectname("librart managemnt sys");
		
		p2.setPid(14141);
		p2.setProjectname("chatbot");
		
		List<Emp> list1=new ArrayList<Emp>();
		List<Project> list2=new ArrayList<Project>();
		List<Project> list3=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		list3.add(p1);
		
		e1.setProjects(list2);
		e2.setProjects(list3);
		
		//p2.setEmployees(list1);
		
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("done...");

	}

}
