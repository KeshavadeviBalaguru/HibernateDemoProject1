package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class MainApp {

	public static void main(String[] args) {
		
		        MyLaptop lop=new MyLaptop();
		        lop.setLid(101);
		        lop.setLname("Dell");
		
                Student sob=new Student();
				sob.setRollnum(1);;
				sob.setSname("Abi");
				sob.setMark(450);
		        sob.setLid(lop);
				
				
		        Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(MyLaptop.class);	
		        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		        SessionFactory sf=conn.buildSessionFactory(reg);
		        Session sess=sf.openSession();
		       Transaction tx=sess.beginTransaction();
		        
		        
		        sess.save(lop);
		        sess.save(sob);
		        tx.commit();
		        		
			

		

		
        		
	}


	}


