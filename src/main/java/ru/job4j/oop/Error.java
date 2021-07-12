package ru.job4j.oop;

public class Error {
    private  boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error erorr = new Error();
        erorr.printInfo();
        Error one = new Error(true, 1, "first");
        one.printInfo();
        Error two = new Error(false, 2, "second");
        two.printInfo();
        Error three = new Error(true, 3, "third");
        three.printInfo();
    }
}
