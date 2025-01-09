package com.data;

import org.hibernate.SessionFactory;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = JavaConfig.getSessionFactory();
       System.out.println(factory);
       System.out.println("Connected Successfully");
    }
}
