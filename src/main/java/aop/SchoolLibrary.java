package aop;


import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public  class SchoolLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("We take book from SchoolLibrary");
    }
}
