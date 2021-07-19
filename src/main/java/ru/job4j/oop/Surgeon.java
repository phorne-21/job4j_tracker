package ru.job4j.oop;

public class Surgeon extends Doctor{
    private boolean canOperateOnPeople;

    public Surgeon(String name, String surname, String education, String birthday, String category, boolean canOperateOnPeople) {
        super(name, surname, education, birthday, category);
        this.canOperateOnPeople = canOperateOnPeople;
    }

    public boolean getCanOperateOnPeople() {
        return this.canOperateOnPeople;
    }
}
