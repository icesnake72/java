package fileio;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;
    private String tel;

    public Person() {
        age = 0;
        name = "";
        tel = "";
    }

    public Person(int age, String name, String tel) {
        this.age = age;
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
