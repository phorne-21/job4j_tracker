package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int x = -1;
        for (int index = 0; index < products.length; index++) {
            Product prod = products[index];
            if (prod == null) {
                x = index;
                break;
            }
        }
        return x;
    }
}
