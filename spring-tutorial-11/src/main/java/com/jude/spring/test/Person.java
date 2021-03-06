package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class Person {

    private int id;
    private String name;

    private int taxId;

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public Person() {
    }

    public static Person getInstance(int id, String name) {
        System.out.println("creating person using factory method");
        return new Person(id, name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void onCreate() {
        System.out.println("Person created: " + this);
    }

    public void onDestroy() {
        System.out.println("Person destoryed. ");
    }

    public void speak() {
        System.out.println("Hello i am a person.");
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                '}';
    }
}
