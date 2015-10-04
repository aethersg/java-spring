package com.jude.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by judetan on 4/10/15.
 */
public class App {
    public static void main(String[] args) {
        /*
        as the beans when created are singletons
        as such when you run the program Both are using the same bean and the taxid will change if we change it in the program as we have done here.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person1 = (Person) context.getBean("person");
        person1.speak();


        Person person2 = (Person) context.getBean("person");
        person2.speak();

        person1.setTaxId(666);

        System.out.println(person2);
    }
}
