package aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy // он создает прокси(маклер) дает разрешение на то, что чтобы создать аспектный класс
public class MyConfig {
}
