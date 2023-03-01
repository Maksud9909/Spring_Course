package HibernateTest;

import HibernateTest.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//он  читает этот файл, после чего он будет знать как нужно создавать
                .addAnnotatedClass(Employee.class)//далее нужно показать какой файл нужно читать
                .buildSessionFactory();//вот так вот создются сессии


        try {
            Session session = factory.getCurrentSession(); // здесь он подключается к базе, обертка
            session.beginTransaction(); // здесь мы разрешили управлять базами

            // мы создали лист, создали запрос и взяли из БД employee,взяли результат,внизу написано имя класса
            //List<Employee> list = session.createQuery("from Employee ").getResultList();

            List<Employee> list = session.createQuery("from Employee " +
                    "where name = 'Aleksandr' and salary > 690").getResultList(); // мы описали чтобы имя было Александр

            for (Employee e:
                 list) {
                System.out.println(e);
            }




            session.getTransaction().commit(); // здесь мы закрыли то есть, подтвердили сохранение
            System.out.println("Done!");
        }finally {
            factory.close();
        }



    }
}
