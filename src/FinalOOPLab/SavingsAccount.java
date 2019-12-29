package FinalOOPLab;

public class SavingsAccount extends Account implements Comparable<SavingsAccount>{
    private double interestRate;
    public SavingsAccount(String accountID, String customerID, String accountType, double balance, double interestRate) {
        super(accountID, customerID, accountType, balance);
        this.interestRate = interestRate;
    }


    @Override
    public String toString() {

        return "accID: " + getAccountID() + ", Type: " + getAccountType() + " current " +
                "balance: " + getBalance() + " Interest Rate: " + getInterestRate();
    }


    private double getInterestRate() {
        return interestRate;
    }

    @Override
    public int compareTo(SavingsAccount saveAcc) {
        if (this.getInterestRate() > saveAcc.getInterestRate())
            return 1;
        else
            return 0;
    }
}
