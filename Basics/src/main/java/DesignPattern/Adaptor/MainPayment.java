package DesignPattern.Adaptor;

public class MainPayment {

    public static void main(String[] args) {

        StripePayment stripe = new StripePayment();

        PaymentProcessor adaptor = new StripeAdaptor(stripe);

        PaymentService paymentService = new PaymentService(adaptor);

        paymentService.processPayment(1000);
    }

}
