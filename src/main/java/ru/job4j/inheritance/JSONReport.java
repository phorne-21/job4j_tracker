package ru.job4j.inheritance;

public class JSONReport extends TextReport{
    public String generate(String name, String body) {
        String gnrtNane = "\t\"name\" : \"" + name + "\",";
        String gnrtBody = "\t\"body\" : \"" + body + "\"";
        return "{" + System.lineSeparator() + gnrtNane + System.lineSeparator() + gnrtBody + System.lineSeparator() + "}";
    }
}
