package com.data.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

	    Stud_Address ad = new Stud_Address(103,"Permanent","Pune");
	    Stud_Address ad2 = new Stud_Address(104,"Office","Mumbai");
	    List<Stud_Address> list = new ArrayList<Stud_Address>();
	    list.add(ad);
	    list.add(ad2);

	    Stud_Dtls st = new Stud_Dtls();
	    st.setId(202);
	    st.setName("Dhiraj");
	    st.setAddres(list);
       
	    Session session = factory.openSession();
	    Stud_Dtls sts = session.get(Stud_Dtls.class, 202);
	    System.out.println("Student Name "+sts.getName());
	    for(Stud_Address add: sts.getAddres()) {
	    	System.out.println("Address Type "+add.getAddresType()+", "+"City "+add.getCity());
	    }
	    Transaction tx = session.beginTransaction();
	    session.save(ad);
	    session.save(ad2);
	    session.save(st);
        tx.commit();
	    session.close();
	    
	    
	    
	}
}
