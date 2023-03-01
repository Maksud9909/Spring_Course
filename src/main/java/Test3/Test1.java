package Test3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTest1.xml");

        Student student = context.getBean("personBean",Student.class);
        student = new Student("Maksud","Rustamov","Math",17);
        System.out.println(student.age);

        System.out.println("-----");
        System.out.println(student);



        context.close();
    }
}
//        School school = context.getBean("schoolBean",School.class);
//        school = new School("IDU",50);