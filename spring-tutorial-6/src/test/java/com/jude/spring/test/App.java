package com.jude.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by judetan on 4/10/15.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person) context.getBean("person");
        person.speak();
    }
}
