package com.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.data.first_program.Student3;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = JavaConfig.getSessionFactory();
		Student3 st = new Student3();
		st.setId(25);
		st.setSname("Kiran");
		st.setSmail("kiran@gmail.com");
		st.setCity("Pune");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
	}
}
