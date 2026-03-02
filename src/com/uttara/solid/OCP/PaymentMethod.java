package com.uttara.solid.OCP;
/*
Open for extension, closed for modification.
	❌ Bad example (changing code every time)
		class PaymentService {
		public void processPayment(String type) {
			if (type.equals("CREDIT_CARD")) {
				// credit card logic
			} else if (type.equals("PAYPAL")) {
				// paypal logic
			}
		}
	}
	Adding Apple Pay?
	👉 Modify the class (risk of breaking existing logic).
 */

public interface PaymentMethod {
    void pay();
}
class CreditCardPayment implements PaymentMethod {
    public void pay() {
        // credit card logic
    }
}

class PaypalPayment implements PaymentMethod {
    public void pay() {
        // paypal logic
    }
}
class PaymentService {
    public void processPayment(PaymentMethod method) {
        method.pay();
    }
}
/*
	New payment type?
		👉 Add a new class. No changes to existing code. 🎉
 */
