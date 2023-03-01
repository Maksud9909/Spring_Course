package Spring_Intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Spring Container cоздан теперь из него можно будет брать объекты
        Pet pet = context.getBean("myPet", Pet.class ); // Здесь мы уже взяли инфо из Spring Container
        pet.say();
        context.close();
    }
}
