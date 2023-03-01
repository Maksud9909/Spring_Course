package Spring_Intro;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @PostConstruct
    public void init() {
        System.out.println("Class dog: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: destroy method");
    }


    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
