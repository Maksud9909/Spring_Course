package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("universityBean")
public class University {
    private List<Student> studentsList = new ArrayList<>();


    public void addStudents(){
        Student st1 = new Student("Maksud Rustamov",1,4.5);
        Student st2 = new Student("Murad Antonov",3,4.1);
        Student st3 = new Student("Umar Kayumov",2,5);

        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println("Начало метода: getStudents");
        System.out.println("Information from method getStudents: ");
        System.out.println(studentsList);
        return studentsList;
    }
}
