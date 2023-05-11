package org.example;

import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //11th issue
        Random r=new Random();
        Map<Integer,Person> dataBase=new HashMap<>();
        Faker faker=new Faker();
        //creating the mao with fake persons
        for(int i=0;i<100;i++){
            System.out.println(Person.getId());
            dataBase.put(Person.getId(),new Person(faker.name().name(),faker.name().lastName(),r.nextInt(0,100)));
        }
        Collection<Person>values=dataBase.values().stream().filter(p->p.getAge()>60).toList();
        //filtering older than 60
        for(var i:values){
            System.out.println(i.getName()+" is"+i.getAge()+" years old");
        }
        System.out.println(dataBase.size());
        //removing odd persons
        for(int i=0;i<100;i++){
            if(dataBase.keySet().contains(i)){
                if(i%2==0){
                    System.out.println(dataBase.get(i).getName());
                }
                else{
                    dataBase.remove(i);
                }
            }
        }
        System.out.println(dataBase.size());

        //12th issue
        Faker faker1=new Faker();
        //the key here will be the email of any user
        Map<String,Client>dataBase2=new HashMap<>();
        LinkedList<Map<String,Client>>listBase=new LinkedList<>();
        for(var i:listBase){
            if(i.get("some email").getAge()>18){
                System.out.println(i.get("some email").getName());
            }
        }
    }
}