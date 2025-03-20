package Exercise4_DIP;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1000.0);

        PaymentMethod paymentMethod = new EWalletPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);

        paymentProcessor.processPayment(order);
    }
}