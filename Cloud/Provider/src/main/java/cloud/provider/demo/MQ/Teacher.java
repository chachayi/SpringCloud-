package cloud.provider.demo.MQ;

import java.io.Serializable;

public class Teacher implements Serializable {
    String name;

    Teacher(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
