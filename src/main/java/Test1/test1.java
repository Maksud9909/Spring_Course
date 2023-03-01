package Test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(MyConfig.class);



        Car car = context.getBean("carBean", Car.class);
        car.setAgeOfCar(1990);
        car.setColor("RED");

        System.out.println(car.getName());





        context.close();


        //Car car = new Car("Mersedez",1990,"white");
    }
}
