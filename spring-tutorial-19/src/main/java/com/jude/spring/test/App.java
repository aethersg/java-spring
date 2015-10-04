package com.jude.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by judetan on 4/10/15.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Logger logger = (Logger) context.getBean("logger");

        logger.writeConsole("Hello there");
        logger.writeFile("Hi again");
    }
}