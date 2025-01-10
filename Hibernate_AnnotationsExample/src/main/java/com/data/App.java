package com.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    { 
    	SessionFactory factory = new Configuration().configure("com/data/hibernate.cfg.xml").buildSessionFactory();
    	Emp emp = new Emp();
    	emp.setName("Dhiraj");
    	emp.setEmail("dhiraj@gmail.com");
    	emp.setJoiningDate(new Date());
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(emp);
    	tx.commit();
    	
    	session.close();

    }
}
