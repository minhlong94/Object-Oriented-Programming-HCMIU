package Lab5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product("Blackfyre", 1, "FIRE AND BLOOD"));
        productArrayList.add(new Product("Ice",1,"WINTER IS COMING"));
        productArrayList.add(new Product("Dawn",1,"SWORD OF THE MORNING")); //I'm a fan of ASOIAF
        GUI g = new GUI();
        g.prepareGUI(productArrayList);
        // I personally do not really like to design GUI since to me it's designers' jobs, so sorry if it is not attractive.
        // However, I do not know how to make the ProductList's JTextArea to align with the description's JTextArea, please teach me if you know how to
    }
}
