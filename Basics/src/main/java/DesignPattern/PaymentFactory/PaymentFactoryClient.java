package DesignPattern.PaymentFactory;

public class PaymentFactoryClient {

    private Payment payment;

    public PaymentFactoryClient(PaymentFactory paymentFactory) {
        this.payment = paymentFactory.createPayment();
    }

    public Payment getPayment()
    {
        return payment;
    }
}
