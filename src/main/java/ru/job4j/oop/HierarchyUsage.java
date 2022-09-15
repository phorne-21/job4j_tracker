package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object bj = car;
        Object ocar = new Car();
        Car carFromObj = (Car) ocar;
    }
}
