package aop.aspetcts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspetcts.MyPointCuts.allAddMethods())") // здесь мы показываем самый короткий путь на его род класс
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: проверка прав ");
        System.out.println("------------------------------");

    }
}
