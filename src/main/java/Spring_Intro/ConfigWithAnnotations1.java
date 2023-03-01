package Spring_Intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());













//        Cat cat = context.getBean("catBean", Cat.class); // если не написать id то оно, будет как название класса с маленькоц буквой
//        cat.say();
//        System.out.println(cat.name);

        context.close();
    }
}
