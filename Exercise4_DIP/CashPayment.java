package Exercise4_DIP;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in Cash");
    }
}
