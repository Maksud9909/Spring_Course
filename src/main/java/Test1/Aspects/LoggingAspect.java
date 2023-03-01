package Test1.Aspects;



import Test1.Car;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Order(7)
public class LoggingAspect {


    @Pointcut("execution(* *(..))")
    private void loggingAgeMetod(){}

    @AfterReturning(pointcut = "loggingAgeMetod()",returning = "car")
    public void loggingMethod(Car car){

        Car firstCar = car;
        String carName = car.getName();
        carName = "BMW";

        firstCar.setName(carName);










        System.out.println("loggingMethod: We check logging methods");


        }

    }


