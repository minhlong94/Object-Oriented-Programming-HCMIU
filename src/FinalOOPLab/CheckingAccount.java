package FinalOOPLab;

public class CheckingAccount extends Account implements Comparable<CheckingAccount>{

    private double overdraftAmount;
    public CheckingAccount(String accountID, String customerID, String accountType, double balance, double overdraftAmount) {
        super(accountID, customerID, accountType, balance);
        this.overdraftAmount = overdraftAmount;
    }

    private double getOverdraftAmount() {
        return overdraftAmount;
    }

    public boolean withdraw(double amount) {
        if (this.getBalance()<amount){
            if ((amount - this.getBalance()) > this.getOverdraftAmount()){
                return false;
            }
            else{
                this.setOverdraftAmount(this.getOverdraftAmount()-(amount-this.getBalance()));
                this.setBalance(0);
                return true;
            }
        }
        else{
            this.setBalance(this.getBalance()-amount);
            return true;
        }
    }


    public String toString() {
        return "accID: " + getAccountID() + ", Type: " + getAccountType() + " current " +
                "balance: " + getBalance() + " Overdraft Amount: " + getOverdraftAmount();
    }


    @Override
    public int compareTo(CheckingAccount checkingAccount) {
        if (this.getOverdraftAmount() > checkingAccount.getOverdraftAmount()){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
