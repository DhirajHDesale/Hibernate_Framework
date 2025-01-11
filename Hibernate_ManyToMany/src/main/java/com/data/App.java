package com.data;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Emp_Addresses add = new Emp_Addresses();
		add.setId(101);
		add.setAddress("Pune");
		Emp_Addresses add2 = new Emp_Addresses();
		add2.setId(102);
		add2.setAddress("Mumbai");
		List<Emp_Addresses> list = new ArrayList<>();
		list.add(add);
		list.add(add2);
		
		Emp_Dtls dtl = new Emp_Dtls();
		dtl.setEmpid(201);
		dtl.setName("Kiran");
		dtl.setAddres(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(add);
		session.save(add2);
		session.save(dtl);
		tx.commit();
		session.close();

	}
}
