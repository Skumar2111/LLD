package DesignPattern.proxy;

public class PaymentService implements IPaymentService{
    @Override
    public void pay() {
        System.out.println("Payment service is being executed");
    }
}
