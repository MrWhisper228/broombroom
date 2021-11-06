package com.company;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Renault     ", LocalDate.of(1999, 10, 15), "dark    gray  ", "brand   -   new", -1500, "gas", -500);
        System.out.println(car1);

        Book book1 = new Book(new Author("Ray Bredberry"), new Descritption("About mars stuff"), new Title("Mars Chronicle"));
        Book book2 = new Book(new Author("Jack London"), new Descritption("Gold rush"), new Title("White Silence"));
        Book book3 = new Book(new Author("Aleksandr Pushkin"), new Descritption("Tales"), new Title("Carica Lebed"));
        BookShelf bookShelf1 = new BookShelf(1, book1, book2, book3);
        System.out.println(bookShelf1.toString());


    }
}
