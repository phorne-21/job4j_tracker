package ru.job4j.oop;

public class Builder extends Engineer{
    private String typeOfJob;

    public Builder(String name, String surname, String education, String birthday, String specificity, String typeOfJob) {
        super(name, surname, education, birthday, specificity);
        this.typeOfJob = typeOfJob;
    }

    public String getTypeOfJob() {
        return this.typeOfJob;
    }
}
