package aop.aspetcts;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {



    @Around("execution(public String returnBook())")
    public Object aroundBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("aroundBookLoggingAdvice: в библиотеку " +
                "пытаются вернуть книгу");



        Object targetMethodResult = null;
        try{
            targetMethodResult = proceedingJoinPoint.proceed(); // вот здесь мы самостаятельно вызвыаем метод
        }catch (Exception e){
            System.out.println("aroundBookLoggingAdvice: было поймано исключение"
                    + e);
            targetMethodResult = "Unknown title of the book";
            throw e;
        }
        //targetMethodResult = "Преступление и наказание"; // тут мы изменили название перменной



        System.out.println("aroundBookLoggingAdvice: в библиотеку " +
                "успешно вернули книгу");
        return targetMethodResult;
    }
}
