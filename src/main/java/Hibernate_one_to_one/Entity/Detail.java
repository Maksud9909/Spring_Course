package Hibernate_one_to_one.Entity;


import jakarta.persistence.*;



@Entity
@Table(name = "details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phonNuber;

    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "empDetail",cascade = {CascadeType.REFRESH,
            CascadeType.PERSIST}) // говорим о местополежении, этих настроек в переменной другого класса
    private Employee employee;


    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phonNuber='" + phonNuber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Detail() {
    }

    public Detail(String city, String phonNuber, String email) {
        this.city = city;
        this.phonNuber = phonNuber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhonNuber() {
        return phonNuber;
    }

    public void setPhonNuber(String phonNuber) {
        this.phonNuber = phonNuber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
