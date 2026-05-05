package com.old.cgi;

import java.util.List;
import java.util.Map;

public interface ILibrarySystem {
    void addBook(IBook book,int quantity);
    void removeBook(IBook book,int quantity);
    int calculateTotalPrice();
    Map<String, Integer> getCategoryTotalPrice();
    List<BooksInfo> booksInfo();
    List<CategoryWithAuthorCount> categoryAndAuthorWithCount();
}
