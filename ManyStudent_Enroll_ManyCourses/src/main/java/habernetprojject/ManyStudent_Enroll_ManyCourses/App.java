package habernetprojject.ManyStudent_Enroll_ManyCourses;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s=sf.openSession();
        
        Students s1=new Students();
        s1.setStudent_Id(1);
        s1.setStudent_Name("Rupesh Yenare");
        
        
        Students s2=new Students();
        s2.setStudent_Id(2);
        s2.setStudent_Name("Priti Yenare");
        
        Courses c1=new Courses();
        c1.setCourse_Id(101);
        c1.setCourse_Name("java developer");
        c1.setCourse_Duration("6 months");
        
        
        Courses c2=new Courses();
        c2.setCourse_Id(102);
        c2.setCourse_Name("testing");
        c2.setCourse_Duration("3 months");
        
        List<Courses> co=new ArrayList<Courses>();
        co.add(c1);
        co.add(c2);
        
        List<Students> st=new ArrayList<Students>();
        st.add(s1);
        st.add(s2);
        
        s1.setCourse(co);
        s2.setCourse(co);
        c1.setStudent(st);
        c2.setStudent(st);
        
        Transaction tr = s.beginTransaction();
        
        s.save(s1);
        s.save(s2);
        s.save(c1);
        s.save(c2);
        
        tr.commit();
        s.close();
        
    }
}
