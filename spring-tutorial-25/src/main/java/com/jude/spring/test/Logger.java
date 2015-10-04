package com.jude.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by judetan on 4/10/15.
 */
public class Logger {
    @Autowired
    private ConsoleWriter consoleWriter;

    @Autowired
    private FileWriter fileWriter;

    /*
    @Autowired

    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }
    */

    //@Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    //@Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}
