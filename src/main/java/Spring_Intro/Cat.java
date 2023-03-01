package Spring_Intro;

import org.springframework.stereotype.Component;

//@Component("catBean") // это и есть id нашего бина только сделан в классе
public class Cat implements Pet {
    String name;
    public Cat() {
        System.out.println("Cat bean created");
    }

    @Override
    public void say() {
        System.out.println("Mew-Mew");
    }
}
