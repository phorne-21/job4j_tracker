package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        // создаем объект типа Car
        Car car = new Car();
        // делаем приведение к типу родителя Transport - овышвющее приведение
        Transport tp = car;
        // делаем приведение к типу Object - up casting
        Object bj = car;
        /* Приведение типа при создании объекта. */
        Object ocar = new Car();
        /* Приведение типа за счет понижения по иерархии - down casting */
        Car carFromObj = (Car) ocar;

        /* Ошибка в приведении типа. */
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle; // код завершится с ошибкой приведения типов ClassCastException
    }
}
