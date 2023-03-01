package aop.aspetcts;


import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {


//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents");
//
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное " +
                "окончание работы метода или выброс исключение");
    }










//    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
//    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("AfterThrowingGetStudentsLoggingAdvice: логируем " +
//                "выброс исключения " + exception);
//    }




















//    @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students){ // вот так можно взять информацию с помощью аспекта
//
//        Student firstStudent = students.get(0);
//
//
//        // мы здесь изменили немного имя студента
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//
//        // мы здесь изменили немного оценку
//        double avrGrade = firstStudent.getAvgGrade();
//        avrGrade = avrGrade + 1;
//        firstStudent.setAvgGrade(avrGrade);
//
//
//
//
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы  метода getStudents");
//    }
}
