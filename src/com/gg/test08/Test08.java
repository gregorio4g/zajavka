package com.gg.test08;

public class Test08 {
    public static void main(String[] args) {
        System.out.println("\nPytanie 01");
        QuizClassExample quizClassExample = new QuizClassExample();
        System.out.println(quizClassExample.value);

        System.out.println("\nPytanie 02");
        System.out.println("Monkey jest klasą.");
        System.out.println("monkey jest referencją wskazującą obiekt stworzony w pamięci");

        System.out.println("\nPytanie 08");
        AnotherQuizQuestion08 q = new AnotherQuizQuestion08();
        q.print((byte) 1);
        q.print((short) 1);
        q.print(true);
        q.print(1.234);
        q.print(1.234f);
        q.print("1.234f");
        q.print("true");

        System.out.println("\nPytanie 09");
        Student09 first = new Student09();
        first.id = 1;
        Student09 second = new Student09();
        second.id = 1;
        System.out.println(first.equals(second) ? "OK" : "NOT OK");

        System.out.println("\nPytanie 12");
        Book12 book1 = new Book12();
        Book12 book2 = new Book12();
        System.out.println(book1.equals(book2));

        book1.title = "Title 1";
        System.out.println(book1.equals(book2));

        book2.title = "Title 2";
        System.out.println(book1.equals(book2));

        book2.title = "Title 1";
        System.out.println(book1.equals(book2));

        book1.title = null;
        System.out.println(book1.equals(book2));

        book2.title = null;
        book1.author = "Author 1";
        System.out.println(book1.equals(book2));

        book2.author = "Author 2";
        System.out.println(book1.equals(book2));

        book2.author = "Author 1";
        System.out.println(book1.equals(book2));

    }
}
