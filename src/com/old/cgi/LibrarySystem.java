package com.old.cgi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrarySystem implements ILibrarySystem {
    Map<IBook, Integer> inventory = new HashMap<>();

    @Override
    public void addBook(IBook book, int quantity) {
        if (inventory.containsKey(book)) {
            inventory.put(book, inventory.get(book) + quantity);
        } else {
            inventory.put(book, quantity);
        }
    }

    @Override
    public void removeBook(IBook book, int quantity) {
        if (inventory.containsKey(book)) {

            int currentQty = inventory.get(book);
            if (currentQty <= quantity) {
                inventory.remove(book);
            } else {
                inventory.put(book, currentQty - quantity);
            }
        }
    }

    @Override
    public int calculateTotalPrice() {
        int total = 0;
//        inventory.entrySet().stream().map(tot->tot.getKey().getPrice() *tot.getValue())
//        for (Map.Entry<IBook, Integer> entry : inventory.entrySet()) {
//            total += entry.getKey().getPrice() * entry.getValue();
//        }
//        return total;
        return inventory.entrySet()
                .stream()
                .mapToInt(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }

    @Override
    public Map<String, Integer> getCategoryTotalPrice() {
        Map<String, Integer> categoryPriceMap = new HashMap<>();

        for (Map.Entry<IBook, Integer> entry : inventory.entrySet()) {
            IBook book = entry.getKey();
            int totalPrice =0;
            totalPrice+= book.getPrice() * entry.getValue();
            if (categoryPriceMap.containsKey(book))
            {
                categoryPriceMap.put(book.getCategory(),
                        categoryPriceMap.get(book.getCategory()) + totalPrice);
            } else {
                categoryPriceMap.put(book.getCategory(), totalPrice);
            }
        }

        return categoryPriceMap;
    }

    @Override
    public List<BooksInfo> booksInfo() {
        List<BooksInfo> list = new ArrayList<>();
        for (Map.Entry<IBook, Integer> entry : inventory.entrySet()) {
            IBook book = entry.getKey();
            int quantity = entry.getValue();
            list.add(new BooksInfo(book.getTitle(), quantity, book.getPrice()));
        }
        return list;
    }

    @Override
    public List<CategoryWithAuthorCount> categoryAndAuthorWithCount() {
        Map<String, Map<String, Integer>> map = new HashMap<>();

        // category -> (author -> count)
        for (Map.Entry<IBook, Integer> entry : inventory.entrySet()) {
            IBook book = entry.getKey();
            int quantity = entry.getValue();

            map.putIfAbsent(book.getCategory(), new HashMap<>());
            Map<String, Integer> authorMap = map.get(book.getCategory());

            authorMap.put(
                    book.getAuthor(),
                    authorMap.getOrDefault(book.getAuthor(), 0) + quantity
            );
        }
        System.out.println("categoryAndAuthorWithCount map : " + map);
        List<CategoryWithAuthorCount> result = new ArrayList<>();

        for (String category : map.keySet()) {
            Map<String, Integer> authorMap = map.get(category);

            for (String author : authorMap.keySet()) {
                result.add(new CategoryWithAuthorCount(
                        category,
                        author,
                        authorMap.get(author)
                ));
            }
        }

        return result;
    }
}
