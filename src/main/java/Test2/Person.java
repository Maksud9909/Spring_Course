package Test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    String name;
    String surname;
    int age;
    String experince;
    String sex;
    Pet pet;

    public Person(String name, String surname, int age, String experince, String sex, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experince = experince;
        this.sex = sex;
        this.pet = pet;
    }

    public Person(Pet pet) {
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperince() {
        return experince;
    }

    public void setExperince(String experince) {
        this.experince = experince;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experince='" + experince + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
