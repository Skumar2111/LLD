package main.java.com.example.park_sure.service;

import com.example.park_sure.service.enums.TicketStatus;

import java.time.LocalDateTime;

public class Ticket {

    String id;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    TicketStatus status;


    public boolean closeTicket(String id)
    {
        return true;
    }

    public LocalDateTime getParkingDuration(Ticket ticket)
    {
        return LocalDateTime.now();
    }

    public TicketStatus getStatus()
    {
        return TicketStatus.ACTIVE;
    }


}
