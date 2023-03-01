package HibernateTest;

import HibernateTest.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//он  читает этот файл, после чего он будет знать как нужно создавать
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Employee.class)//далее нужно показать какой файл нужно читать
                .buildSessionFactory();//вот так вот создются сессии


        try {
            Session session = factory.getCurrentSession(); // здесь он подключается к базе, обертка
            Employee emp = new Employee("Aleksandr", "Antonov", "IT", 679);


            session.beginTransaction(); // здесь мы разрешили управлять базами
            session.save(emp); // мы добавили, что мы хотели изменить, сохранили
            session.getTransaction().commit(); // здесь мы закрыли то есть, подтвердили сохранение
            System.out.println(emp);

            System.out.println("Done!");
        }finally {
            factory.close();
        }



    }
}
