package main.java.com.example.park_sure.service;

import com.example.park_sure.service.enums.PaymentMethod;
import com.example.park_sure.service.intf.IPaymentGateway;

public class PaymentGateway implements IPaymentGateway {

    @Override
    public void processPayment(double amount, PaymentMethod paymentMethod) {
        System.out.println("Process Payment");
    }
}
