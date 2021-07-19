package ru.job4j.oop;

public class Surgeon extends Doctor{
    private boolean operateOnPeople;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education, String birthday, String category, boolean operateOnPeople) {
        super(name, surname, education, birthday, category);
        this.operateOnPeople = operateOnPeople;
    }

    public boolean getOperateOnPeople() {
        return this.operateOnPeople;
    }
}
