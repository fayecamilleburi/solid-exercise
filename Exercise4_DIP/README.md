# Exercise 4: Dependency Inversion Principle

## Problem Scenario
Refactor the following codes applying the **Dependency Inversion Principle**.
```
public class PaymentProcessor {
    public void processPayment(Order order) {
        String paymentMethod = order.getPaymentMethod();

        if (paymentMethod.equals("ewallet")) {
            EWallet ewallet = new EWallet();
            ewallet.pay(order.getAmount());
            System.out.println("You are paying in GCash");
        } else if (paymentMethod.equals("cash")) {
            System.out.println("You are paying in Cash");
        } else if (paymentMethod.equals("creditcard")) {
            CreditCard creditCard = new CreditCard();
            creditCard.charge(order.getAmount());
            System.out.println("You are paying using Credit Card");
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}
```

Naming Conventions:
1. Class name must be a NOUN (singular).
2. Class names must start with capital letters.
3. Attribute name and method name should start with a small letter.
4. Method name should be a verb.

## Notes
- `PaymentMethod` defines a common contract for all payment methods. Any class implementing this interface must provide its own implemenetation of the `pay` method.
- `EWalletPayment` implements `PaymentMethod` to handle e-wallet transactions (e.g., GCash). It also defines how an e-wallet processes a payment.
- `CreditCardPayment` implements `PaymentMethod` to handle credit card transactions. It also defines how a credit card processes a payment.
- `CashPayment` implements `PaymentMethod` to handle cash transactions. It also defines how a cash payment is processed.
- `Order` represents an order placed by the customer. It stores the total amount to be paid.
- `PaymentProcessor` handles payment processing without depending on concrete payment types. It uses dependency injection to receive a `PaymentMethod`, ensuring flexibility.
- `Main` demostrates how to use the system by selecting a payment method dynamically.

## Output
![Exercise4_DIP_Output](image.png)