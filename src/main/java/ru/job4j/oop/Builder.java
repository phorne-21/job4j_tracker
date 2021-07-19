package ru.job4j.oop;

public class Builder extends Engineer{
    private String typeOfJob;

    public Builder(String name, String surname, String education, String birthday, boolean createsEngineeringSolutions, String typeOfJob) {
        super(name, surname, education, birthday, createsEngineeringSolutions);
        this.typeOfJob = typeOfJob;
    }

    public String getTypeOfJob() {
        return this.typeOfJob;
    }
}
