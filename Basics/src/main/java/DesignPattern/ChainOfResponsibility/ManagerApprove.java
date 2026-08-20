package DesignPattern.ChainOfResponsibility;

public class ManagerApprove implements LeaveApprove {

    LeaveApprove next;

    @Override
    public void setNext(LeaveApprove next) {
        this.next = next;
    }

    @Override
    public void approve(int days) {

        if(days <= 2)
        {
            System.out.println("Manager Approved");
        }
        else
        {
            next.approve(days);
        }
    }
}
