package com.uttara;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateTest {
    public static void main(String[] args) {
      LocalDate birthDay = LocalDate.of(1984, 01, 9);
      LocalDate today= LocalDate.now();
      System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }
}
