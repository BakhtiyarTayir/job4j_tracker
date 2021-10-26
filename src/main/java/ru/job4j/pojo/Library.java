package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 10);
        Book book2 = new Book("Dune", 12);
        Book book3 = new Book("Foundation", 33);
        Book book4 = new Book("Second Foundation", 1);
        Book[] books = {book1, book2, book3, book4};

        for (int index = 0; index < books.length; index++) {
            Book book =  books[index];
            System.out.println(book.getName()+ " - " + book.getCount());
        }
        System.out.println();;
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Replace books ");
        for (int index = 0; index < books.length; index++) {
            Book book =  books[index];
            System.out.println(book.getName()+ " - " + book.getCount());
        }
        System.out.println();;
        System.out.println("Book name equals Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book =  books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
