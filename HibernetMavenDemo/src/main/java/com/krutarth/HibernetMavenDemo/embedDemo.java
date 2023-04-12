package com.krutarth.HibernetMavenDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class embedDemo {
	 public static void main( String[] args ) throws IOException
	    {
	        System.out.println( "Hello World!" );
	        
	        collage c=new collage();
	        c.setCid(1);
	        c.setName("L.J");
	        
	        Certificate cr=new Certificate();
	        cr.setCourse("computer");
	        cr.setDuration("4 years");
	        c.setCerti(cr);
	        
	        
	        SessionFactory factory= new Configuration().configure().buildSessionFactory();
	        Session session=factory.openSession();
	        session.beginTransaction();
	        session.save(c);
	        session.getTransaction().commit();
	    
	        
	        
	        
	        
	        
	        
	        session.close();
	        System.out.println("done..");
	        
	        
	    }
	
	
}
