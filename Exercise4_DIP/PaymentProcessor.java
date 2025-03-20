package Exercise4_DIP;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(Order order) {
        paymentMethod.pay(order.getAmount());
    }
}
