package Hibernate_one_to_one;

import Hibernate_one_to_one.Entity.Detail;
import Hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();


        try {

//            Employee employee = new Employee("Oleg","Smirnov","Sales",1000);
//            Detail detail = new Detail("Tashkent ","098765678","oleg@gmail.com");
//            employee.setEmpDetail(detail);
            session.beginTransaction();

            Employee employee = session.get(Employee.class,2);
           session.delete(employee);


            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            factory.close();
            session.close();
        }
    }
}
