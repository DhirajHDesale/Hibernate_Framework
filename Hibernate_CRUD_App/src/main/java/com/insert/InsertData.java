package com.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Employee emp1 = new Employee();
		emp1.setName("Shubham");
		emp1.setEmail("shubham@gmail.com");
		emp1.setCity("Chopda");
		emp1.setSalary(30000.00);
		
		Employee emp2 = new Employee();
		emp2.setName("Akshay");
		emp2.setEmail("akshay@gmail.com");
		emp2.setCity("Dhule");
		emp2.setSalary(40000.00);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		System.out.println("Record Stored");
		tx.commit();
		session.close();
	}
}
