package com.jude.spring.test;

/**
 * Created by judetan on 4/10/15.
 */
public class Logger {
    private LogWriter consoleWriter;
    private LogWriter fileWriter;

    public void setConsoleWriter(LogWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}