package DesignPattern.Creational.Payment;

public class UPIPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Current transaction is being done by UPI");
    }
}
