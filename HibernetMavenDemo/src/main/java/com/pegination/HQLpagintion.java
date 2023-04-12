package com.pegination;

import org.hibernate.query.*;

import com.krutarth.HibernetMavenDemo.Student;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLpagintion {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Query q=s.createQuery("from Student");
		
		//implement pagination using hibernate
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		List<Student> list = q.list();
		for(Student st:list)
		{
			System.out.println(st.getId()+":"+st.getName()+":"+st.getCity());
		}
		
		
		s.close();
		factory.close();

	}

}
