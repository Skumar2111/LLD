package DesignPattern.Strategy;

public class PaymentMain {

    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new UPIPaymentStrategy();

        PaymentService paymentService = new PaymentService(paymentStrategy);

        paymentService.pay();
    }
}
