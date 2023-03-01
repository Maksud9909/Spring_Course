package Test;

public class Work {
    String workPlace;
    int salary;

    @Override
    public String toString() {
        return "Work{" +
                "workPlace='" + workPlace + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
