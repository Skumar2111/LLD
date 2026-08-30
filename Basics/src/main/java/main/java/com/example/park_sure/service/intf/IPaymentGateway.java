package main.java.com.example.park_sure.service.intf;

import com.example.park_sure.service.enums.PaymentMethod;

public interface IPaymentGateway {
    public void processPayment(double amount , PaymentMethod paymentMethod);
}
