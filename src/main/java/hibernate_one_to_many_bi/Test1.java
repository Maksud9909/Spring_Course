package hibernate_one_to_many_bi;



import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employeee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employeee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();


        try {

            session.beginTransaction();

//            Department department = new Department("Sales",500,1500);
//            Employeee employeee1 = new Employeee("Maksud","Rustamov",800);
//            Employeee employeee2 = new Employeee("Umar","Kayumov",900);
//            Employeee employeee3 = new Employeee("Anton","Sidorov",760);
//
//            department.addEmployeeToDepartment(employeee1);
//            department.addEmployeeToDepartment(employeee2);
//            department.addEmployeeToDepartment(employeee3);
//            session.save(department);


            System.out.println("Get department");
            Department department = session.get(Department.class,5);

            System.out.println("Show the department");
            System.out.println(department);

            System.out.println("show employees of the department");
            System.out.println(department.getEmps());














            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            factory.close();
            session.close();
        }
    }
}
