package DesignPattern.Creational.Payment;

public class CreditCardPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Current transaction is being done by Credit card");
    }
}
