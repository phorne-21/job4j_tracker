package ru.job4j.oop;

public class Doctor extends Profession{
    private String category;

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String education, String birthday, String category) {
        super(name, surname, education, birthday);
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}
