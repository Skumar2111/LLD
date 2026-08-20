package DesignPattern.ChainOfResponsibility;

public class ApproveMain {

    public static void main(String[] args) {

        LeaveApprove managerApprove = new ManagerApprove();
        LeaveApprove directorApprove = new DirectorApprove();


        managerApprove.setNext(directorApprove);

        managerApprove.approve(5);


    }


}
