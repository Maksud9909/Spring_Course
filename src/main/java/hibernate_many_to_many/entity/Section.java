package hibernate_many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(
            name = "child_section", // тут мы описали где это все будет отображаться
            joinColumns = @JoinColumn(name = "section_id"), // тут мы описали название столбца
            inverseJoinColumns = @JoinColumn(name = "child_id") // тут мы прописываем, обратное данной таблице
    )
    private List<Child> childList;

    public void addChildToSection(Child child){
        if(childList == null){
            childList = new ArrayList<>();
        }
        childList.add(child);
    }







    public Section(String name) {
        this.name = name;
    }

    public Section() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
