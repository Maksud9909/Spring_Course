package Spring_Intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml"); // можно сюда вписать и 2 файла
        Dog myDog = context.getBean("myPet",Dog.class);
        //myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet",Dog.class);
        //yourDog.setName("Strelka");
        System.out.println(myDog==yourDog); // теперь они разные из-за того, что prototype





        System.out.println(myDog);
        System.out.println(yourDog);












        context.close();

    }
}
