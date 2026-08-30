package main.java.com.example.park_sure.service;

import com.example.park_sure.service.enums.PaymentMethod;
import com.example.park_sure.service.enums.PaymentStatus;
import com.example.park_sure.service.paymentStrategy.NormalPricing;

import java.time.LocalDateTime;

public class PaymentService {

    String id;
    Ticket ticket;
    double amount;
    PaymentMethod paymentMethod;
    PaymentStatus paymentStatus;
    String transactionId;
    LocalDateTime paidAt;

    NormalPricing normalPricing;


    public boolean processTransaction()
    {
        return true;
    }

    public PaymentStatus paymentStatus()
    {
        return PaymentStatus.SUCCESS;
    }
    

    public String getTransactionId()
    {
        return "ABC";
    }

    public double getAmount()
    {
        return normalPricing.calculateFee(ticket,LocalDateTime.now());
    }

}
