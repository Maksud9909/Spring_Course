package Test;

import hibernate_one_to_many_bi.entity.Employeee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class config {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");
        Employee employee = context.getBean("MyEmployee", Employee.class);
        Work work = context.getBean("MyWork",Work.class);

        Employee employee2 = context.getBean("MyEmployee", Employee.class);


        employee.name = "Maksud";
        System.out.println(employee2.name);

        System.out.println(employee.name);

        context.close();
    }
}
