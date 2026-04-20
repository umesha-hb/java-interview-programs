package com.interview.cgi;

public class Book implements IBook{
    private int id;
    private String title;
    private String author;
    private String category;
    private int price;
    @Override
    public void setId(int id) {
      this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setAuthor(String author) {
    this.author = author;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setCategory(String category) {
      this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setPrice(int price) {
            this.price=price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
