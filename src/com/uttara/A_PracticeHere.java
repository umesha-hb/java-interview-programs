package com.uttara;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A_PracticeHere {
    public static void main(String[] args) {

		/*
		 * List<String> list = new ArrayList<>();
		 * list.add("http://www.example.com/blah_blah");
		 * list.add("http://www.google.com/wpstyle/?p=364");
		 * list.add("http://www.yahoo.com/testcat_au.html"); Map m =
		 * list.stream().map(s->{ int f = s.indexOf("www"); int l = s.indexOf("com");
		 * String domain = s.substring(f, l + 3); return domain;
		 * }).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 * System.out.println(m);
		 */

		/*
		 * String[] inputs={"http://www.example.com/blah_blah",
		 * "http://www.google.com/wpstyle/?p=364",
		 * "http://www.yahoo.com/testcat_au.html",
		 * "http://www.google.com/events/#&product=browser",
		 * "http://www.example.com/wpstyle/?p=364"}; Arrays.stream(inputs).map(line -> {
		 * try { URI uri = new URI(line); return uri.getHost(); } catch (Exception e) {
		 * e.printStackTrace(); return null; }
		 * }).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		 * .entrySet().stream() .forEach(e -> System.out.println(e.getKey() + "=" +
		 * e.getValue()));
		 */
      String[] inputs={"http://www.example.com/blah_blah",
                "http://www.google.com/wpstyle/?p=364",
                "http://www.yahoo.com/testcat_au.html",
                "http://www.google.com/events/#&product=browser",
                "http://www.example.com/wpstyle/?p=364"};
     
        List<String> sites= Arrays.stream(inputs).flatMap(line-> Arrays.stream(line.split("/")))
                .filter(words->words.startsWith("www")).collect(Collectors.toList());
         Map<String,Long> map=sites.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().forEach(e->System.out.println(e.getKey()+"="+e.getValue()));


    }
}
