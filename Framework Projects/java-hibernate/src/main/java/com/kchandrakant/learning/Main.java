package com.kchandrakant.learning;

import java.util.Date;

import org.hibernate.Session;

import com.kchandrakant.learning.hibernate.HibernateUtil;
import com.kchandrakant.learning.model.Customer;

public class Main {

	public static void main(String[] args) {
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Customer customer = new Customer();
        
        customer.setFirstName("Kumar");
        customer.setLastName("Chandrakant");
        customer.setCreatedBy("Self");
        customer.setCreatedDate(new Date());
 
        session.save(customer);
        session.getTransaction().commit();
		
	}
}