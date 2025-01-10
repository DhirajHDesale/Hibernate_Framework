package com.read;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class ReadAllData {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		List<Employee> emps = session.createQuery("from Employee", Employee.class).list();
		for(Employee emp:emps)
			System.out.println(emp);
	}
}
