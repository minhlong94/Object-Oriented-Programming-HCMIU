package FinalOOPLab;

public class Test {
    public static void main(String[] args) {
        Bank Millbelle = new Bank("The Banker","Somewhere in Fog Canyon");
        Millbelle.addAccount(new SavingsAccount("sa01","cus001","Saving Type",3000,0.03));
        Millbelle.addAccount(new SavingsAccount("sa05","cus001","Saving Type",2000,0.02));
        Millbelle.addAccount(new SavingsAccount("sa02","cus003","Saving Type",2000,0.02));
        Millbelle.addAccount(new SavingsAccount("sa03","cus004","Saving Type",6000,0.05));
        Millbelle.addAccount(new SavingsAccount("sa04","cus005","Saving Type",8000,0.05));
        Millbelle.addAccount(new CheckingAccount("ca01", "cus001","Checking Type",5000,500));
        Millbelle.addAccount(new CheckingAccount("ca02","cus002","Checking Type",4000,400));
        Millbelle.addAccount(new CheckingAccount("ca03","cus003","Checking Type",2000,200));
        Millbelle.addAccount(new CheckingAccount("ca04","cus004","Checking Type",7000,700));
        Millbelle.addAccount(new CheckingAccount("ca05","cus005","Checking Type",5000,500));

        Account testwithdraw = new CheckingAccount("sa01","cus001","Saving Type",3000,200);
        System.out.println(Millbelle.displayAccByCus("cus001", "Saving Type"));
        System.out.println(Millbelle.displayAccByCus("cus003","Checking Type"));
        System.out.println(((CheckingAccount) testwithdraw).withdraw(300));
    }
}
