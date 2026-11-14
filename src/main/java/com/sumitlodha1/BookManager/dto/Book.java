package com.sumitlodha1.BookManager.dto;

public class Book {
    private int id;
    private String name;
    private String author;

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book " + id + " with name : " + name + " written By :"+ author;
    }
}
