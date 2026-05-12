package com.uttara.circuitbreaker;

public class TestCircuitBreaker {

    public static void main(String[] args) throws InterruptedException {

        CircuitBreaker cb = new CircuitBreaker(3, 3000);

        // 🟢 CLOSED STATE
        System.out.println("Initial State: " + cb.getState());
        System.out.println("Request allowed? " + cb.allowRequest());

        // 🔴 Move to OPEN (trigger failures)
        System.out.println("\n--- Triggering Failures ---");
        cb.recordFailure();
        System.out.println("State: " + cb.getState());

        cb.recordFailure();
        System.out.println("State: " + cb.getState());

        cb.recordFailure(); // threshold reached → OPEN
        System.out.println("State after threshold reached: " + cb.getState());

        // 🚫 OPEN STATE (requests blocked)
        System.out.println("\n--- OPEN State  ---");
        boolean allowed = cb.allowRequest();
        System.out.println("Request allowed? " + allowed); // should be false
        System.out.println("State: " + cb.getState());


        // ⏳ Wait for retry timeout
        System.out.println("\nWaiting for retry timeout...");
        Thread.sleep(3500);

        // 🟡 HALF_OPEN STATE
        System.out.println("\n--- HALF_OPEN State ---");
        allowed = cb.allowRequest();
        System.out.println("Request allowed? " + allowed);
        System.out.println("Current State: " + cb.getState());

        // ✅ Success → CLOSED
        System.out.println("\n--- Recording Success ---");
        cb.recordSuccess();
        System.out.println("State after success: " + cb.getState());

        // 🔁 Back to normal (CLOSED)
        System.out.println("\n--- CLOSED State again ---");
        allowed = cb.allowRequest();
        System.out.println("Request allowed? " + allowed);
        System.out.println("Final State: " + cb.getState());
    }
}