package Test2;

import org.springframework.stereotype.Component;

@Component("petBean")
public class Pet {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String Say(){
        return "Meow";
    }
}
