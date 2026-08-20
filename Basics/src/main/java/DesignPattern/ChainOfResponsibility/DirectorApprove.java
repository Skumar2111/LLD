package DesignPattern.ChainOfResponsibility;

public class DirectorApprove implements LeaveApprove{

    LeaveApprove next;

    @Override
    public void setNext(LeaveApprove next) {
       // no handler
    }

    @Override
    public void approve(int days) {
        System.out.println("Director Approved");
    }
}
