package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Филиппова Екатерина Александровна");
        student.setGroup("32-н");
        student.setDate(new Date());

        System.out.println(student.getName() + " поступил(а) в группу " + student.getGroup() + " c " + student.getDate());
    }
}
