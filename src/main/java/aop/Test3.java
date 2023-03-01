package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;




public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts ");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean",UniLibrary.class);
        String bookName = uniLibrary.returnBook(); // когда назначаешь метод на пересенную он сразу, вызывается
        System.out.println("The book namely " + bookName + " was returned to the Library");


        context.close();
        System.out.println("Method main ends ");

    }
}
