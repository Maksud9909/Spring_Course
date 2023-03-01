package Test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTest.xml");

        Person person = context.getBean("personBean", Person.class);
        Person person1 = context.getBean("personBean",Person.class);

        person.name = "Murod";

        System.out.println(person.name);
        System.out.println(person1.name);



        context.close();
    }
}
