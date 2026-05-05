package com.old.cgi;

public interface IBook {
    void setId(int id);
    int getId();
    void setTitle(String titile);
    String getTitle();
    void setAuthor(String author);
    String getAuthor();
    void setCategory(String category);
    String getCategory();
    void setPrice(int price);
    int getPrice();
}
