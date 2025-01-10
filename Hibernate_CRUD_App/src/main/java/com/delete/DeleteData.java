package com.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class DeleteData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee emp = session.get(Employee.class, 2);
		Transaction tx = session.beginTransaction();
		session.delete(emp);
		tx.commit();
		System.out.println("Record Deleted");
		session.close();
		
	}
}
