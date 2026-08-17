package DesignPattern.Adaptor;

public class StripeAdaptor implements PaymentProcessor{

    StripePayment stripePayment;

    public StripeAdaptor(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(double amount) {
        stripePayment.makePayment(amount);
    }
}
