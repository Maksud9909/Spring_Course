package aop;


import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{


    public void addBook(String person_name, Book book){
        System.out.println("We add book to the UniLibrary " + book.getName());
        System.out.println("------------------------------");
    }
    public void getBook(){
        System.out.println("We take the book from UniLibrary");
        System.out.println("------------------------------");

    }
    public String returnBook(){
        int a = 10 / 0;
        System.out.println("We return the book to the UniLibray");
        return "Война и мир";
    }








    public void addMagazine(){
        System.out.println("We add magazine to the UniLibrary");
        System.out.println("------------------------------");
    }
    public void getMagazine(){
        System.out.println("We take a magazine from the UniLibrary");
        System.out.println("------------------------------");
    }
    public void returnMagazine(){
        System.out.println("We return magzine to the UniLibrary");
        System.out.println("------------------------------");

    }




}
