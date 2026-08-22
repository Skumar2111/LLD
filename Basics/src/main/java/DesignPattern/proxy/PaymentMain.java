package DesignPattern.proxy;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        PaymentProxy proxy = new PaymentProxy(paymentService);

        proxy.pay();
    }
}
