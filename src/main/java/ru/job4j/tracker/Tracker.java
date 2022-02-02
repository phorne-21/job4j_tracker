package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] resultItem = new Item[size];
        int resultSize = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                resultItem[resultSize++] = items[index];
            }
        }
        return Arrays.copyOf(resultItem, resultSize);
    }

    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}