package FinalOOPLab;

public abstract class Account {
    protected String accountID;
    protected String customerID;
    protected String accountType;
    protected double balance;

    public Account(String accountID, String customerID, String accountType, double balance) {
        this.accountID = accountID;
        this.customerID = customerID;
        this.accountType = accountType;
        this.balance = balance;
    }



    public abstract String toString();

    public String getAccountID() {
        return accountID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

}
