package assignmenttwo;

public class SeniorOfficer extends Approver {
    @Override
    public void approveWithdrawal(double amount) {
        if (amount >= 10000 && amount <= 1000000) {
            System.out.println("Senior Officer approved the withdrawal of Tk. " + amount);
        } else if (nextApprover != null) {
            System.out.println("Senior Officer forwards the request to next approver.");
            nextApprover.approveWithdrawal(amount);
        }
    }
}

