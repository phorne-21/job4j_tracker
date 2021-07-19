package ru.job4j.oop;

public class Builder extends Engineer{
    private String typeOfJob;

    public Builder(String typeOfJob, boolean createsEngineeringSolutions, String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.createsEngineeringSolutions = createsEngineeringSolutions;
        this.typeOfJob = typeOfJob;
    }

    public String getTypeOfJob() {
        return this.typeOfJob;
    }
}
