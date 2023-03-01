package Test1.Aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {


    @Pointcut("execution(public void *(..))")
    private void securityCheckForCarName(){}

    @AfterReturning("securityCheckForCarName()")
    public void securityCheckAspect(){
        System.out.println("securityCheckAspect: be carefull");
    }






}
