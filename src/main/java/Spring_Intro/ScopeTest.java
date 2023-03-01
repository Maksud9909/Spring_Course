package Spring_Intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog1 = context.getBean("dogBean", Dog.class);
        Dog myDog2 = context.getBean("dogBean", Dog.class);

        myDog1.say();

        System.out.println(myDog1==myDog2);
        System.out.println(myDog1);
        System.out.println(myDog2);



        context.close();


    }
}
