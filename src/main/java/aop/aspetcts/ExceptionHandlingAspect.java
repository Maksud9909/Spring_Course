package aop.aspetcts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)

public class ExceptionHandlingAspect {
    @Before("aop.aspetcts.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvise(){
        System.out.println("beforeAddExceptionHandlingAdvise: обработка исключений" +
                " при попытке получить книгу/журнал");
        System.out.println("------------------------------");
    }
}
