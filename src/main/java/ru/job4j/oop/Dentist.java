package ru.job4j.oop;

public class Dentist extends Doctor{
    private boolean haveAToothMachine;

    public Dentist(boolean haveAToothMachine, String category, String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.category = category;
        this.haveAToothMachine = haveAToothMachine;
    }
    public boolean getHaveAToothMachine()  {
        return this.haveAToothMachine;
    }
}
