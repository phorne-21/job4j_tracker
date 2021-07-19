package ru.job4j.oop;

public class Engineer extends Profession{
    private boolean createsEngineeringSolutions;

    public Engineer(String name, String surname, String education, String birthday, boolean createsEngineeringSolutions) {
        super(name, surname, education, birthday);
        this.createsEngineeringSolutions = createsEngineeringSolutions;
    }
    public boolean getCreatesEngineeringSolutions() {
        return this.createsEngineeringSolutions;
    }
}
