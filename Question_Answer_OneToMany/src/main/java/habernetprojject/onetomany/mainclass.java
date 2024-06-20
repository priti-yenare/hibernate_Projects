package habernetprojject.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainclass {

	public static void main(String[] args) {
		Configuration co=new Configuration();
		co.configure("hibernate.cfg.xml");
		SessionFactory factory = co.buildSessionFactory();
		Question q1=new Question();
		Answer a1=new Answer();
		Answer a2=new Answer();
		
		q1.setId(1);
		q1.setName("what is jav");
		
		a1.setAns("jva is programming language");
		a1.setAns_id("a1");
		a1.setQue(q1);
		
		a2.setAns("jva is oop language");
		a2.setAns_id("a2");
		a2.setQue(q1);
		
		List <Answer> list=new ArrayList();
		list.add(a2);
		list.add(a1);
		q1.setAnswer(list);
		Session s = factory.openSession();
		Transaction t=s.beginTransaction();
		s.save(a1);
		s.save(a2);
		s.save(q1);
		t.commit();
		s.close();
		factory.close();
		
		

	}

}
