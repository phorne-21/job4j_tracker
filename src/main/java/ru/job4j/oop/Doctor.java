package ru.job4j.oop;

public class Doctor extends Profession{
    private String category;

    public Doctor(String category,String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}
