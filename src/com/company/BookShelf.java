package com.company;

import java.util.Arrays;

public class BookShelf {
private int layer ;
Book [] books;

    public int getLayer() {
        return layer;
    }

    public Book[] getBooks() {
        return books;
    }

    public BookShelf(int layer, Book... books) {
        this.layer = layer;
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShelf(" +
                "layer number:" + layer +
                ", books are" + Arrays.toString(books) +
                ')';
    }
}
