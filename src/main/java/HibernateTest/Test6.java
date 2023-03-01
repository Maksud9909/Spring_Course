package HibernateTest;

import HibernateTest.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test6 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//он  читает этот файл, после чего он будет знать как нужно создавать
                .addAnnotatedClass(Employee.class)//далее нужно показать какой файл нужно читать
                .buildSessionFactory();//вот так вот создются сессии


        try {
            Session session = factory.getCurrentSession(); // получение сесссии
            session.beginTransaction(); //начало сесси

//            Employee emp = session.get(Employee.class,1); // так мы получаем объект по айди
//            session.delete(emp); // просто вызываем базу данных и удаляем тот объект который хотим

            session.createQuery("delete Employee " +
                    "where name = 'Aleksandr'").executeUpdate();




            session.getTransaction().commit(); // закрытие сессии  



            System.out.println("Done!");
        }finally {
            factory.close();
        }



    }
}
