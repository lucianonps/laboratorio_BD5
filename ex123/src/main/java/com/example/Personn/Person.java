package com.example.Personn;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private int age;
    List<Email>emails;

    public Person(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.emails= new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    


    public int getAge() {
        return age;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addEmail(Email email) {
        this.emails.add(email);
    }

    public String getName() {
        return name;
    }


    
}
