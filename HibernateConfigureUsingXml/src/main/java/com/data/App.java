package com.data;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		System.out.println("Connection Created SuccessFully");

//		Configuration con = new Configuration();
//		con.configure();
//		SessionFactory factory = con.buildSessionFactory();
//		System.out.println("Connection Created Successfully");

		/*
		 * 
		 * 
		 * 
		 * You can use Comment Code or Uncommented Code it will give
		 * you the same result
		 */
	}
}
