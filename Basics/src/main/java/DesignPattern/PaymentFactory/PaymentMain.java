package DesignPattern.PaymentFactory;

public class PaymentMain {

    public static void main(String[] args) {

        CashPaymentFactory cpf = new CashPaymentFactory();
        PaymentFactoryClient pfc = new PaymentFactoryClient(cpf);
        pfc.getPayment().pay();

        /**/

        UPIPaymentFactory upf = new UPIPaymentFactory();
        PaymentFactoryClient pfc_upi = new PaymentFactoryClient(upf);
        pfc_upi.getPayment().pay();

    }
}
