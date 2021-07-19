package ru.job4j.oop;

public class Dentist extends Doctor{
    private boolean healsTooth;

    public Dentist(String name, String surname, String education, String birthday, String category, boolean healsTooth) {
        super(name, surname, education, birthday, category);
        this.healsTooth = healsTooth;
    }
    public boolean getHealsTooth()  {
        return this.healsTooth;
    }
}
