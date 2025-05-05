package assignmenttwo;

public class Bank {
    public static void main(String[] args) {
        // Create handlers
        Approver cashier = new Cashier();
        Approver seniorOfficer = new SeniorOfficer();
        Approver manager = new Manager();

        // Set up the chain
        cashier.setNextApprover(seniorOfficer);
        seniorOfficer.setNextApprover(manager);

        // Test cases
        System.out.println("------ Withdrawal 5000 ------");
        cashier.approveWithdrawal(5000);

        System.out.println("\n------ Withdrawal 50000 ------");
        cashier.approveWithdrawal(50000);

        System.out.println("\n------ Withdrawal 1500000 ------");
        cashier.approveWithdrawal(1500000);
    }
}

