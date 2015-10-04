package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class ConsoleWriter implements LogWriter {
    public void write(String text) {
        System.out.println(text);
    }
}
