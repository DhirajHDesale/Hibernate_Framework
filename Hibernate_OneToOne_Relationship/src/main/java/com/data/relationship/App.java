package com.data.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	
	Student_Details st = new Student_Details();
	st.setName("Ravi");
	
	Address_Details add = new Address_Details();
	add.setCity("Chennai");
	st.setAddress(add);
	add.setSt(st);
	
	
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(st);
	session.save(add);
	tx.commit();
	
	
	//Uni Direction
	
	
	Student_Details st2= session.get(Student_Details.class, 1);
	System.out.println(st2.getSid()+"\n"+st2.getName()+"\n"+st2.getAddress().getCity());
	
	
	//By Direction
	Address_Details ad = session.get(Address_Details.class, 1);
	System.out.println(ad.getAdd_id()+"\n"+ad.getCity()+"\n"+ad.getSt().getName());
	
	
	session.close();
}
}
