package com.example;

/**
 * Created by lsuke on 8/22/2016.
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void showBook(){
        System.out.println("The name of the book is " + getTitle() +
                " written by " + getAuthor() + " in the year" + getYearPublished() +
                " and has " + getPages() + " pages");
    }
}
