package Spring_Intro;
import Spring_Intro.Person.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = new Cat();
        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close(); // нужно всегда это делать из-за того, что экономит память
    }
}
