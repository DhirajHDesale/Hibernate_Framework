package com.data.usingloadmethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.data.usinggetmethod.Student;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Student st = session.load(Student.class, 1);
		System.out.println(st);
	}
}
