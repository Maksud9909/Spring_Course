package aop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Преступление и наказние")
    private String name;
    @Value("Ф.М.Достоевский")
    private String author;
    @Value("1866")
    private int yearOfPublication;





    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }


}
