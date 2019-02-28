package com.axity.example;

public class Person {

    private String name;
    private String lastname;
    private int age;

    public Person(String name){
        this.name=name;
    }

    public Person(String name, String lastname){
        this(name);
        this.lastname=lastname;
    }

    public Person(String name, String lastname, int age){
        this(name,lastname);
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
