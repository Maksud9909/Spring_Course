package Spring_Intro;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties") // он будет брать данные из пропертис файл
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){ // name of the method is a bean
        return new Cat();
    }


    @Bean
    public Person personBean(){
        return new Person(catBean()); // we did dependency injection, we just write here catBean
    }


}
