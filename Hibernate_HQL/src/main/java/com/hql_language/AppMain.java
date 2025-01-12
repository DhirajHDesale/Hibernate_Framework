package com.hql_language;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class AppMain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Stud_Hql st = new Stud_Hql("Kiran", "Dhule", Date.valueOf("2024-02-23"));
		Stud_Hql st2 = new Stud_Hql("Akshay", "Jalgaon", Date.valueOf("2022-06-12"));

		Session session = factory.openSession();

		// Print Data Using HQL
//		String hql = "from Stud_Hql";
//		List<Stud_Hql> query = session.createQuery(hql).list();
//
//		for (Stud_Hql stud : query)
//			System.out.println(stud);

		// Display those data whose name is Kiran
//		String hql2 = "from Stud_Hql where name='Kiran'";
//		Query q = session.createQuery(hql2);
//		
//		System.out.println(q.getResultList());
		
		//Delete Data whose id = 1
		
		
		Transaction tx = session.beginTransaction();
		String hql3 = "delete from Stud_Hql where id=1";
		Query q2 = session.createQuery(hql3);
		int i = q2.executeUpdate();
//		session.save(st);
//		session.save(st2);

		System.out.println(i);
		tx.commit();
		session.close();
	}
}
