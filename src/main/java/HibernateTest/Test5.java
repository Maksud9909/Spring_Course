package HibernateTest;

import HibernateTest.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//он  читает этот файл, после чего он будет знать как нужно создавать
                .addAnnotatedClass(Employee.class)//далее нужно показать какой файл нужно читать
                .buildSessionFactory();//вот так вот создются сессии


        try {
            Session session = factory.getCurrentSession(); // получение сесссии
            session.beginTransaction(); //начало сесси



            session.createQuery("update Employee set salary = 1000" +
                    " where name = 'Aleksandr'").executeUpdate(); // Здесь мы сделали зарплату 1000 всем александорам

            Employee emp = session.get(Employee.class,6); // так мы получаем объект по айди
            emp.setSalary(1209); // так мы поменяли ему зарплату



            session.getTransaction().commit(); // закрытие сессии



            System.out.println("Done!");
        }finally {
            factory.close();
        }



    }
}
