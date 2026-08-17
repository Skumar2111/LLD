package DesignPattern.PaymentFactory;

public class CashPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Current transaction is being done by Cash");
    }
}
