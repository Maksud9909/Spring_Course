package Test1;


import org.springframework.stereotype.Component;

@Component("carBean")
public class Car {
    public String name;
    public int ageOfCar;
    public String color;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", ageOfCar=" + ageOfCar +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAgeOfCar() {
        return ageOfCar;
    }

    public void setAgeOfCar(int ageOfCar) {
        this.ageOfCar = ageOfCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String name, int ageOfCar, String color) {
        this.name = name;
        this.ageOfCar = ageOfCar;
        this.color = color;
    }

    public Car() {
    }

    public void driveCar(){
        System.out.println("i am driving "+ name +
                " and that's cool i think");
    }

    public void carAge(int age){
        System.out.println("This car was made in " + age);
    }

}
