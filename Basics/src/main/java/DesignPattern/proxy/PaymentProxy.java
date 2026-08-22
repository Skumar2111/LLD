package DesignPattern.proxy;

public class PaymentProxy implements IPaymentService{

    PaymentService realPayment;

    public PaymentProxy(PaymentService realPayment) {
        this.realPayment = realPayment;
    }

    @Override
    public void pay() {

        System.out.println("Checking Authentication");

        System.out.println("Checking Authorization");

        realPayment.pay();

    }
}
