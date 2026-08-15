package DesignPattern.Creational.Payment;

public class UPIPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment() {
        return new UPIPayment();
    }
}
