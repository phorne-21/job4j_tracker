package ru.job4j.pojo;

public class Library{
    public static void main(String[] args) {
        Book martian = new Book("Марсианин", 384);
        Book chocolat = new Book("Chocolat", 752);
        Book english = new Book("Very bad english", 308);
        Book code = new Book("Clean code", 0);
        Book[] books = new Book[] {martian, chocolat, english, code};
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Index = " + index + ". Name of a book - \"" + book.getName() + "\", pages: " + book.getPages());
        }
        Book b = books[0];
        books[0] = books[3];
        books[3] = b;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Index = " + index + ". Name of a book - \"" + book.getName() + "\", pages: " + book.getPages());
        }
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println("Index = " + index + ". Name of a book - \"" + book.getName() + "\", pages: " + book.getPages());
            }
        }
    }
}
