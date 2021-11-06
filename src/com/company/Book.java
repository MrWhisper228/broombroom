package com.company;

public class Book {
    Author author;
    Descritption descritption;
    Title title;

    public Book(Author author, Descritption descritption, Title title) {
        this.author = author;
        this.descritption = descritption;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Descritption getDescritption() {
        return descritption;
    }

    public void setDescritption(Descritption descritption) {
        this.descritption = descritption;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book is " + title +' ' + author + ' ' + descritption;
    }
}

