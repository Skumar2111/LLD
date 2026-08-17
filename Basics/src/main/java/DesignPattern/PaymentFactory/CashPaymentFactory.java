package DesignPattern.PaymentFactory;

public class CashPaymentFactory implements PaymentFactory{


    @Override
    public Payment createPayment() {
        return new CashPayment();
    }
}
