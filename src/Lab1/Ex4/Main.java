package Lab1.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order("What the ID");
        System.out.print("Input order size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; ++i) {
            Item item = new Item();
            System.out.print("Input Item ID: ");
            String ID = scanner.nextLine();
            item.setItemID(ID);
            System.out.print("Input Item Name: ");
            String name = scanner.nextLine();
            item.setItemName(name);
            System.out.print("Input item Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            item.setItemPrice(price);
            order.add(item);
        }
        System.out.println(order.calculateAverageCost());
        order.printItem();
    }
}
