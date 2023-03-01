package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("universityBean", University.class);
        university.addStudents(); // здесь мы просто добавляем студентов
        try {
            List<Student> studentList = university.getStudents(); //здесь мы студентов добавляем в переменную
        }catch (IndexOutOfBoundsException e){
            System.out.println("exception was caught " + e);
        }



        context.close();

    }
}
