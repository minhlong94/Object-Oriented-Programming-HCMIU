package Lab1.Ex4;

import java.util.ArrayList;

public class Order {
    private String orderID;
    private ArrayList<Item> orderItemList;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ArrayList<Item> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<Item> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void add(Item item) {
        orderItemList.add(item);
    }

    public Order(String orderID) {
        this.orderID = orderID;
        orderItemList = new ArrayList<Item>();
    }

    public double calculateAverageCost() {
        double sum = 0;
        for (Item item: orderItemList) {
            sum += item.getItemPrice();
        }
        return sum/orderItemList.size();
    }
    public void printItem(){
        orderItemList.forEach(item -> System.out.print(item.toString()));
    }
}
