package DesignPattern.ChainOfResponsibility;

public interface LeaveApprove {

    void setNext(LeaveApprove next);

    void approve(int days);
}
