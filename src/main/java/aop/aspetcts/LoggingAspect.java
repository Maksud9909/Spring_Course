package aop.aspetcts;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import aop.aspetcts.*;



                             // все рабочие процессы, а также служебные процессы нужно писать тут

@Component
@Aspect                                                     // теперь данный класс называется аспект классом
@Order(1)
public class LoggingAspect {




    @Before("aop.aspetcts.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature =
                (MethodSignature)joinPoint.getSignature(); // мы здесь получаем signature
        System.out.println("methodSignature =  " + methodSignature);

        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());

        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());

        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){ // тут идет фильтрация по названию, если имя метода addBook
            Object[] arguments = joinPoint.getArgs(); // через метод getArgs можно узнать, параметры данных методов
            for (Object obj: arguments){ // здесь мы работаем с каждым параметром, который есть
                if(obj instanceof Book){ // если мой параметр Book то мы заходим в метод
                    Book myBook = (Book) obj; // то теперь книга эта
                    System.out.println("Информация о книге - " + myBook.getName()+
                            ", автор " + myBook.getAuthor() + ", год издания " + myBook.getYearOfPublication());
                }
                else if(obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }


        System.out.println("beforeAddLoggingAdvice: Логирование попытка получить книгу или журнал");
        System.out.println("------------------------------");
    }























//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void returnMagazine())")
//    private void returnMagazineFromUnilibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMagazineFromUnilibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUnilibrary()")
//    public void beforeallMethodsExceptReturnMagazineFromUnilibrary(){
//        System.out.println("beforeallMethodsExceptReturnMagazineFromUnilibrary Log#10");
//    }




































//
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromUNilibrary(){}
//
//    @Pointcut("allGetMethodsFromUNilibrary() || allReturnMethodsFromUNilibrary()")
//    private void allGetAndReturnMethodsFromUNilibrary(){}
//
//
//
//
//
//
//
//
//    @Before("allGetMethodsFromUNilibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice:  writting Log #1");
//    }
//    @Before("allReturnMethodsFromUNilibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice:  writting Log #2");
//    }
//    @Before("allGetAndReturnMethodsFromUNilibrary()")
//    public void beforeallGetAndReturnMethodsFromUNilibrary(){
//        System.out.println("beforeallGetAndReturnMethodsFromUNilibrary: writting #Log3 ");
//    }
//



























































































}
