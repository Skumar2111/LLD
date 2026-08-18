package DesignPattern.Strategy;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Cash payment strategies");
    }
}
