package DesignPattern.Adaptor;

public class StripePayment {

    public void makePayment(double amount)
    {
        System.out.println(" Paying amount " +amount+ " using stripe");
    }
}
