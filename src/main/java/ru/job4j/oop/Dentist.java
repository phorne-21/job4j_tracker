package ru.job4j.oop;

public class Dentist extends Doctor{
    private boolean haveAToothMachine;

    public Dentist(String name, String surname, String education, String birthday, String category, boolean haveAToothMachine) {
        super(name, surname, education, birthday, category);
        this.haveAToothMachine = haveAToothMachine;
    }
    public boolean getHaveAToothMachine()  {
        return this.haveAToothMachine;
    }
}
