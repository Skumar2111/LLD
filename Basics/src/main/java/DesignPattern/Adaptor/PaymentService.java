package DesignPattern.Adaptor;

public class PaymentService {

    private final PaymentProcessor paymentProcessor;


    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(double amount)
    {
        paymentProcessor.pay(amount);
    }
}
