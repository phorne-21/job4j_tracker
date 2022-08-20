package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус поехал.");
    }

    @Override
    public void passengers(int num) {
        System.out.println("В автобус зашло " + num + " пассажиров.");
    }

    @Override
    public double refuel(double fuel) {
        double cost = 43.19;
        return fuel * cost;
    }
}
