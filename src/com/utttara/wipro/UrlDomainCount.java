package com.utttara.wipro;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UrlDomainCount {

    public static Map<String, Integer> solutionOne(List<String> myList) {
        Map<String, Integer> map = new HashMap<>();
        myList.forEach(e -> {
            try {
                String host = new URL(e).getHost();
                map.put(host, map.getOrDefault(host, 0) + 1);
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
        });
        return map;
    }

    public static Map<String, Long> solutionTwo(List<String> myList) {
        return myList.stream().map(s->{
            int l =s.indexOf("www");
                    int r =s.indexOf("com");
                    String domain=s.substring(l,r+3);
                    return domain;
                })
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, Long> solutionThree(List<String> myList) {
        return myList.stream()
                .collect(Collectors.groupingBy(e -> {
                    try {
                        return new URL(e).getHost();
                    } catch (MalformedURLException ex) {
                        throw new RuntimeException(ex);
                    }
                }, Collectors.counting()));
    }

    public static Map<String, Long> solutionFour(List<String> myList) {
        return myList.stream()
                .flatMap(e -> Arrays.stream(e.split("/"))
                        .filter(e1->e1.startsWith("www")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        List inputs= Arrays.asList("http://www.example.com/blah_blah",
                "http://www.google.com/wpstyle/?p=364",
                "http://www.yahoo.com/testcat_au.html",
                "http://www.google.com/events/#&product=browser",
                "http://www.example.com/wpstyle/?p=364");
        System.out.println(solutionTwo(inputs));
    }
}
