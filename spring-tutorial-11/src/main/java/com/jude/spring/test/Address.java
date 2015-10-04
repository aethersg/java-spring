package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class Address {
    private String street;
    private String postcode;

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init() {
        System.out.println("Bean Created : ");
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
