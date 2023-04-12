package com.krutarth.HibernetMavenDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        
        
        //creating object of student
        Student s1=new Student();
  
        s1.setName("krutarth");
        s1.setCity("Ahmedabad");
        System.out.println(s1);
        
        //creating object of address
        Address ad=new Address();
        ad.setStreet("new sg road");
        ad.setCity("Ahmedabad");
        ad.setOpen(true);
        ad.setAddeddate(new Date());
        ad.setX(1234.14);
        
        //read image
        FileInputStream fis=new FileInputStream("src/main/java/colorcheck.JPG");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data); 
       
        Session session=factory.openSession();
        System.out.println("enter your choice:\n1->insert\n2->get");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
        	case 1:
        		session.beginTransaction();
                
                session.save(s1);
                session.save(ad);
                session.getTransaction().commit();
                break;
        	case 2:
        		//Student student=(Student)session.get(Student.class , 1);
        		Student student=(Student)session.load(Student.class , 1);
        		System.out.println(student);
        	
        }
        
        
        
        
        
        session.close();
        System.out.println("done..");
        
        
    }
}
