package HibernateTest;


import HibernateTest.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//он  читает этот файл, после чего он будет знать как нужно создавать
                .addAnnotatedClass(Employee.class)//далее нужно показать какой файл нужно читать
                .buildSessionFactory();//вот так вот создются сессии

        Session session = factory.getCurrentSession(); // здесь он подключается к базе, обертка

        session = factory.getCurrentSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class,2);
        session.getTransaction().commit();
        System.out.println(employee);




    }
}
