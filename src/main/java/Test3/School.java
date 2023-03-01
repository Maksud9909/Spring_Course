package Test3;


import org.springframework.stereotype.Component;

@Component("schoolBean")
public class School {
    String NameOfSchool;
    int number;


    public School() {
    }

    public School(String nameOfSchool,int number) {
        NameOfSchool = nameOfSchool;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameOfSchool() {
        return NameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        NameOfSchool = nameOfSchool;
    }

    @Override
    public String toString() {
        return "School{" +
                "number=" + number +
                ", NameOfSchool='" + NameOfSchool + '\'' +
                '}';
    }
}
