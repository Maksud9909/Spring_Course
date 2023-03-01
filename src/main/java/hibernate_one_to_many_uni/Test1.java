package hibernate_one_to_many_uni;




import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();


        try {

            session.beginTransaction();

//            Department department = new Department("HR",500,1500);
//            Employee employee1 = new Employee("Maksud","Rustamov",1000);
//            Employee employee2 = new Employee("Umar","Kayumov",1100);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.save(department);


            Department department = session.get(Department.class,2);
            session.delete(department);










            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            factory.close();
            session.close();
        }
    }
}
