package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class oneTooneMappingDemo {

	public static void main(String[] args) {
		
		
		//creating question object 	
		Question q1=new Question();
		q1.setQuestionid(1212);
		q1.setQuestion("what is java");
		
		//creating answer
		Answer a1=new Answer();
		a1.setAnswerid(343);
		a1.setAnswer("java is proggraming language");
		
		q1.setAnswer(a1);
		
		
		//creating question object
		Question q2=new Question();
		q2.setQuestionid(242);
		q2.setQuestion("what is collection framework");
		
		//creating answer
		Answer a2=new Answer();
		a2.setAnswerid(344);
		a2.setAnswer("API to work  with object in java");
		
		q2.setAnswer(a2);
		
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		session.getTransaction().commit();
		
		//fetching data
		Question ques=(Question)session.load(Question.class,1212);
		System.out.println(ques.getQuestion() );
		System.out.println(ques.getAnswer().getAnswer());
		
		session.close();
		System.out.println("done....");
	}

}
