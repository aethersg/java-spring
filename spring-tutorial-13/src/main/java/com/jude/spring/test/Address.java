package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class Address {
    private String street;
    private String postcode;

    public Address() {

    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init() {
        System.out.println("Bean Created : ");
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +

                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
