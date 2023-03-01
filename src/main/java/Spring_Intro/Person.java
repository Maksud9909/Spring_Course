package Spring_Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private  Pet pet;
   @Value("${person.surname}") // здесь можно будет сразу написать чему будет равна переменная
    private String surname;
    @Value("${person.age}")
    private int age;







//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

public void setPet(Pet pet) {
    System.out.println("Class person: Set Pet");
    this.pet = pet;
}




    public String getSurname() {
        System.out.println("Class Person: set surname ");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set age ");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }











    public Person(Pet pet) {
    System.out.println("Person bean created");
    this.pet = pet;
}
    public void callYourPet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
