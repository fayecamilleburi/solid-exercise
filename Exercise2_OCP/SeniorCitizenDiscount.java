package Exercise2_OCP;

public class SeniorCitizenDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
