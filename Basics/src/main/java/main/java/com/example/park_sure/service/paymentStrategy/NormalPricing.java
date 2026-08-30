package main.java.com.example.park_sure.service.paymentStrategy;

import com.example.park_sure.service.Ticket;
import com.example.park_sure.service.intf.IPricingStrategy;

import java.time.LocalDateTime;

public class NormalPricing implements IPricingStrategy {
    @Override
    public double calculateFee(Ticket ticket, LocalDateTime exitTime) {
        return 10.0;
    }
}
