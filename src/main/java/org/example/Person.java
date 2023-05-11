package org.example;

public class Person {
    public static int getId() {
        return id;
    }

    private static int id;
    private String name;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    private String surName;

    public int getAge() {
        return age;
    }

    private int age;
    public Person(String name, String surName,int age){
        id++;
       this.name=name;
       this.surName=surName;
       this.age=age;
    }
}
