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
        Item[] result = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                result[count++] = items[index];
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                return index;
            }
        }
        return -1;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index >= 0) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            return true;
        }
        return  false;
    }
}