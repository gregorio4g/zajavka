package com.gg.zad07;

import java.util.Arrays;

public class Book {
    private final String ISBN;
    private final String author;
    private final String title;

    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    public Book() {
        this("978-83-01-00000-1", "John Doe", "Unknown");
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book b0 = new Book("978-83-01-00000-1", "Jan Brzechwa", "Kaczka Dziwaczka");
        Book b1 = new Book("978-83-01-00001-1", "Julian Tuwim", "Tite 1");
        Book b2 = new Book("978-83-01-00002-1", "Author2", "Tite 2");
        Book b3 = new Book("978-83-01-00003-1", "Author3", "HTite 3");
        Book b4 = new Book("978-83-01-00004-1", "Author4", "HTite 4");
        Book b5 = new Book("978-83-01-00005-1", "Author5", "HTite 5");
        Book b6 = new Book();

        Book[] bookShelf1 = {b0, b1, b2, b3, b4, b5, b6};
        Book[] bookShelf2 = new Book[bookShelf1.length];

        int index2 = 0;
        for (Book book : bookShelf1) {
            if (book.title.startsWith("H")) {
                bookShelf2[index2] = book;
                index2++;
            }
        }

        Book[] bookShelfOut = Arrays.copyOf(bookShelf2, index2);

        System.out.println(Arrays.toString(bookShelfOut));

    }
}
