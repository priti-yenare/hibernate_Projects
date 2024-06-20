package habernetprojject.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		Configuration co=new Configuration();
		co.configure("hibernate.cfg.xml");
		SessionFactory factory= co.buildSessionFactory();
		
		Question q1=new Question();
		q1.setId(1);
		q1.setQue("what is java");
		
		Answer a1=new Answer();
		a1.setAnsid("a1");
		a1.setAnswer("java is good programming language");
		
		q1.setAns(a1);
		
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		
		s.save(q1);
		s.save(a1);
		tr.commit();
		
		s.close();
		factory.close();
		
		

	}

}
