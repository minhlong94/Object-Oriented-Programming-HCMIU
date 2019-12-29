package FinalOOPLab;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String address;
    private ArrayList<Account> listOfAccount = new ArrayList<>();

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addAccount(Account account){
        listOfAccount.add(account);
        System.out.println(account.getCustomerID() + " " + account.getAccountType() + " " + account.getAccountID() + " " +
                "was successfully added.");
    }
    public String displayAccByCus(String customerID, String accType) {
        String match = null;
        ArrayList<Account> matches = new ArrayList<>();
        for (Account acc: listOfAccount){
            if (acc.getCustomerID().equals(customerID) && acc.getAccountType().equals(accType)) {
                matches.add(acc);
            }
        }
        if (matches.size()==0){
            match = "No Result.";
        }
        else{
            for (Account acc: matches) {
                match = acc.toString();
                }
            }
        return match;
    }
}
        

    

