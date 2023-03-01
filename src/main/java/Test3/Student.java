package Test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("prototype")
public class Student {
    String name;
    String surname;
    String faculty;
    @Value("17")
    int age;
    //@Autowired // тут сразу автоматически подключается к school
    School school;




    public Student() {
    }
//    @Autowired // тут сразу автоматически подключается к school
    public Student(School school){
        System.out.println("School: is created");
        this.school = school;
    }

    public void studentsSchool(){
        System.out.println("School is " + school);
    }

    public Student(String name, String surname, String faculty, int age) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
