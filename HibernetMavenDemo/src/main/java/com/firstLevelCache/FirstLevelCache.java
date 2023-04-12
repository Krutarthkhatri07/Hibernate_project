package com.firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.krutarth.HibernetMavenDemo.Student;

public class FirstLevelCache {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		Student student = s.get(Student.class, 1);
		System.out.println(student);
		
		System.out.println("************");
		
		Student student1 = s.get(Student.class, 1);
		System.out.println(student1);
		
		System.out.println(s.contains(student1));
		
		s.close();
		factory.close();

	}

}
