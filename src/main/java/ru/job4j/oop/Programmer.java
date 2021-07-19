package ru.job4j.oop;

public class Programmer extends Engineer{
    private String prLang;

    public Programmer(String name, String surname, String education, String birthday, String specificity, String prLang) {
        super(name, surname, education, birthday, specificity);
        this.prLang = prLang;
    }

    public String getPrLang() {
        return this.prLang;
    }
}
