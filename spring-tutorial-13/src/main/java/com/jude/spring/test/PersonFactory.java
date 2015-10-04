package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class PersonFactory {
    public  Person createPerson(int id, String name) {
        System.out.println("Using factory to create person");
        return new Person(id, name);
    }
}
