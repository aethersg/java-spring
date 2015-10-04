package com.jude.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by judetan on 4/10/15.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person2");

        Address address2 = (Address) context.getBean("address2");
        System.out.println(address2);
        System.out.println(person1);
        System.out.println(person2);
    }
}
