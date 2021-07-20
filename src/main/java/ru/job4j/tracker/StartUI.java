package ru.job4j.tracker;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI extends Item{

    public static void main(String[] args) {
        Item text = new Item();
        LocalDateTime time = text.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentTime = time.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentTime);
    }
}
