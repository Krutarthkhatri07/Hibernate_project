package com.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.krutarth.HibernetMavenDemo.Student;

public class secondLevelCacheDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s1=factory.openSession();
		
		Student student = s1.get(Student.class, 1);
		System.out.println(student);
		
		s1.close();
		System.out.println("************");
		
		Session s2=factory.openSession();
		Student student1 = s2.get(Student.class, 1);
		System.out.println(student1);
		
		s2.close();
		factory.close();

	}

}
