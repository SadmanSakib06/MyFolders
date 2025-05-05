package assignmenttwo;

public class Cashier extends Approver {
    @Override
    public void approveWithdrawal(double amount) {
        if (amount < 10000) {
            System.out.println("Cashier approved the withdrawal of Tk. " + amount);
        } else if (nextApprover != null) {
            System.out.println("Cashier forwards the request to next approver.");
            nextApprover.approveWithdrawal(amount);
        }
    }
}
