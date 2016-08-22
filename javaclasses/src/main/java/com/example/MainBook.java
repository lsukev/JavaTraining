package com.example;

public class MainBook {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.setPages(200);
        myBook.setYearPublished(2016);
        myBook.setAuthor("Kevin Ivy");
        myBook.setTitle("Ready for the Beach!");

        myBook.showBook();
    }
}
