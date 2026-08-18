package DesignPattern.Strategy;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("UPI strategy is getting executed");
    }
}
