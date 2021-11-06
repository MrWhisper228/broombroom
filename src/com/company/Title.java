package com.company;

public class Title {
    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName.strip();
    }

    public Title(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "bookName is " + bookName ;
    }
}
