package com.uttara.solid.SRP;

/*A class should have only one reason to change.
        ❌ Bad example (one class doing everything)
class OrderService {
    public void createOrder() {
        // create order
    }

    public void chargeCreditCard() {
        // payment logic
    }

    public void sendConfirmationEmail() {
        // email logic
    }
}
Why this is bad:
Order rules change → class changes
		Payment rules change → class changes
		Email logic changes → class changes
✅ Good example (separate responsibilities) */
public class OrderService {
    public void createOrder() {
        // create order
    }
}
class PaymentService {
    public void chargeCreditCard() {
        // payment logic
    }
}

class EmailService {
    public void sendConfirmationEmail() {
        // email logic
    }
}

