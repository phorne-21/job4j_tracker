package ru.job4j.oop;

public class Engineer extends Profession{
    private String specificity;

    public Engineer(){
        super();
    }

    public Engineer(String name, String surname, String education, String birthday, String specificity) {
        super(name, surname, education, birthday);
        this.specificity = specificity;
    }
}
