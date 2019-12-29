package Lab5;

public class Product {
    private String name, des;
    private int amt;

    public Product(String name, int amt, String des) {
        this.name = name;
        this.des = des;
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String toString(){
        return "Product: " + name + " Amount: " + amt + " Description: " + des + "\n";
    }
}
