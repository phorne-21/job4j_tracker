package ru.job4j.oop;

public class Engineer extends Profession{
    private boolean createsEngineeringSolutions;

    public Engineer(boolean createsEngineeringSolutions, String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.createsEngineeringSolutions = createsEngineeringSolutions;
    }
    public boolean getCreatesEngineeringSolutions() {
        return this.createsEngineeringSolutions;
    }
}
