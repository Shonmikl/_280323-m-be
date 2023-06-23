package org.example._2023_06_23.lom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private int age;
    private String name;
    private double salary;
    private Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Person(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person(27, "Nik", 2555.56);
        System.out.println(person.getName());
    }
}