package assignmenttwo;

public class Manager extends Approver {
    @Override
    public void approveWithdrawal(double amount) {
        if (amount > 1000000) {
            System.out.println("Manager approved the withdrawal of Tk. " + amount);
        } else {
            System.out.println("Manager: No further approver required.");
        }
    }
}

