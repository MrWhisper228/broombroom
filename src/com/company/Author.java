package com.company;

public class Author {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.strip();
    }

    public Author(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "author is" + author;
    }
}
