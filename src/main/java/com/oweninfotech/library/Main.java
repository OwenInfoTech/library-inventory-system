package com.oweninfotech.library;

public class Main {
    public static void main(String []args){
        Book book1 = new Book(1, "War and Peace", 1225, "Leo Tolstoy");

        System.out.println(book1.getDetails());
        System.out.println("Available :" + book1.isAvailable());

        book1.checkOut();
        System.out.println("Available after checkout " + book1.isAvailable());

        DVD dvd1 = new DVD(2, "Inciption", "Christopher Nolan" ,148);

        System.out.println(dvd1.getDetails());
        System.out.println("Available: " + dvd1.isAvailable());

    }
}
