package Lab1.Ex4;

public class Item {
    private String itemID;
    private String itemName;
    private int itemPrice;

    public Item() {
        itemID = null;
        itemName = null;
        itemPrice = 0;
    }
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String toString(){
        return "ItemID: " + this.getItemID() + ", Item Name: " + this.getItemName() + ", Item Price: " + this.getItemPrice();
    }
}
