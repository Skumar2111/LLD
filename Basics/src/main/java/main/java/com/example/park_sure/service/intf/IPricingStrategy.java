package main.java.com.example.park_sure.service.intf;

import com.example.park_sure.service.Ticket;

import java.time.LocalDateTime;

public interface IPricingStrategy {
    public double calculateFee(Ticket ticket, LocalDateTime exitTime);
}
