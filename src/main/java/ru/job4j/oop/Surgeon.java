package ru.job4j.oop;

public class Surgeon extends Doctor{
    private boolean canOperateOnPeople;

    public Surgeon(boolean canOperateOnPeople, String category, String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.category = category;
        this.canOperateOnPeople = canOperateOnPeople;
    }

    public boolean getCanOperateOnPeople() {
        return this.canOperateOnPeople;
    }
}
