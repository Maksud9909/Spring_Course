package Hibernate_one_to_one;

import Hibernate_one_to_one.Entity.Detail;
import Hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();


        try {



            session.beginTransaction();

            Detail detail = session.get(Detail.class,1);
//            detail.getEmployee().setEmpDetail(null); // мы сделали, то что он больше не сылается работника

            session.delete(detail);



            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            factory.close();
            session.close();
        }
    }
}
