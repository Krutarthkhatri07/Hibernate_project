package com.hql;

import java.util.Arrays;
import java.util.List;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.krutarth.HibernetMavenDemo.Student;

public class HQLdemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		s.beginTransaction();
		
		//select query
		String query="from Student where name=:x";
		Query q= s.createQuery(query);
		q.setParameter("x", "krutarth");
		
		List<Student> list=q.list();
		
		for(Student student:list)
		{
			System.out.println(student.getName());
		}
		System.out.println("-------------------------------------");
		
		//delete query
//		Query q1=s.createQuery("delete from Student where city=:y");
//		q1.setParameter("y", "surat");
//		int r=q1.executeUpdate();
//		System.out.println("deleted:"+r);
//		
//		//update query
//		Query q1=s.createQuery("update Student set city=:y where name=:z");
//		q1.setParameter("y", "surat");
//		q1.setParameter("z", "vidhi");
//		int r=q1.executeUpdate();
//		System.out.println("updated:"+r);
		
		//join query
		Query q1=s.createQuery("select q.question,a.answer from Question as q inner join q.answer as a");
		List<Object []> list1=q1.list();
		for(Object[] o:list1)
		{
			System.out.println(Arrays.toString(o));
		}
		
		
		
		
		s.getTransaction().commit();
		s.close();
		factory.close();
		System.out.println("done...");

	}

}
