package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        if (products.length - 1 - index >= 0)
            System.arraycopy(products, index + 1, products, index, products.length - 1 - index);
            products[products.length - 1] = null;
        return products;
    }
}
