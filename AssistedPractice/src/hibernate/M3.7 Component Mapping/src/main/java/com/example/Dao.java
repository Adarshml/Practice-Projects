package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Dao {
	public int insert(Employee1 e) {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int r=(int)s.save(e);
		t.commit();
		return r;
	}

}
