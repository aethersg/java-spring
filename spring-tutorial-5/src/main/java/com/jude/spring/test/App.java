/**
 * Created by judetan on 4/10/15.
 */
package com.jude.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*
        this is where we will tell context where the bean is
         */
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        /*
        this is where we get the bean and also in such a case we will need to cast the context
        to the person type so that it can output it as a singleton
         */
        Person person = (Person) context.getBean("person");
        person.speak();
    }
}
