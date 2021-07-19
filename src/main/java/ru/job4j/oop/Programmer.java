package ru.job4j.oop;

public class Programmer extends Engineer{
    private String programmingLanguage;

    public Programmer(String programmingLanguage, boolean createsEngineeringSolutions, String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.createsEngineeringSolutions = createsEngineeringSolutions;
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }
}
