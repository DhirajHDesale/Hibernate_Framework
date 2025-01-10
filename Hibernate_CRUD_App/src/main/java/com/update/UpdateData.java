package com.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee emp = session.get(Employee.class, 2);
		emp.setName("Dhiraj");
		emp.setCity("Pune");
		emp.setEmail("dhiraj@gmail.com");
		emp.setSalary(40000.00);
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(emp);
		tx.commit();
		System.out.println("Record Updated");
		session.close();
	}
}
