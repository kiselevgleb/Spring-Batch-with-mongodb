package ru.otus.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Person {
    @Id
    public String id;
    private String name;
    private int age;

    public void onBirthDay() {
        ++age;
    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "P{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
