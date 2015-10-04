package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class FileWriter implements LogWriter{
    public void write(String text) {
        System.out.println(text);
    }
}
