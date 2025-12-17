package com.uttara;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ATM note availability
        int available200, available100, available50;

        System.out.print("Enter available ₹200 notes: ");
        available200 = sc.nextInt();

        System.out.print("Enter available ₹100 notes: ");
        available100 = sc.nextInt();

        System.out.print("Enter available ₹50 notes: ");
        available50 = sc.nextInt();

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount % 50 != 0) {
            System.out.println("Cannot dispense this amount (must be multiple of ₹50).");
            return;
        }

        int used200 = 0, used100 = 0, used50 = 0;
        int remaining = amount;

        // Use ₹200 notes
   
        used200 = Math.min(remaining / 200, available200);
        remaining -= used200 * 200;

       
        // Use ₹100 notes
        used100 = Math.min(remaining / 100, available100);
        remaining -= used100 * 100;


        // Use ₹50 notes
        used50 = Math.min(remaining / 50, available50);
        remaining -= used50 * 50;


        if (remaining != 0) {
            System.out.println("ATM cannot dispense the exact amount with available notes.");
        } else {
            System.out.println("\nDispensed Successfully!");
            System.out.println("₹200 x " + used200);
            System.out.println("₹100 x " + used100);
            System.out.println("₹50  x " + used50);
            System.out.println("Total notes: " + (used200 + used100 + used50));
        }

        sc.close();
    }
}
