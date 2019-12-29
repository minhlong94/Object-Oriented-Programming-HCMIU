package Lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class GUI extends JComponent{

    public void prepareGUI(ArrayList<Product> PL){
        JFrame frame = new JFrame("Warehouse Management");
        frame.setSize(1000,1000);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("ProductList.txt"), "utf-8"))) {
                    String printdata = "";
                    for (Product p: PL){
                        printdata += p.toString(); // Get all strings from the list
                    }
                    writer.write(printdata); // Write
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.exit(0); // Close
            }
        });

        Container myPanel = frame.getContentPane();
        GroupLayout gr = new GroupLayout(myPanel);
        gr.setAutoCreateGaps(true);
        gr.setAutoCreateContainerGaps(true);
        myPanel.setLayout(gr);

        JLabel productName = new JLabel("Product Name:", JLabel.CENTER); //Product Name
        JLabel productName2 = new JLabel("Product Name:", JLabel.CENTER); // For search field JLabel
        final JTextField productText = new JTextField(15); //Text field for Product Name
        final JTextField productSearch = new JTextField(15); // For search field

        JLabel amount = new JLabel("Amount:", JLabel.CENTER); // Amount
        JLabel amount2 = new JLabel("Amount:", JLabel.CENTER); // Same reason
        final JTextField amountText = new JTextField(15); //Text Field for Amount
        final JTextField amountSearch = new JTextField(15); // Text Field for Amount search, just do this to make it quick

        JLabel description = new JLabel("Description:", JLabel.CENTER);
        JLabel description2 = new JLabel("Description:", JLabel.CENTER); // yeah, same reason
        final JTextArea descriptionText = new JTextArea(15,15);
        descriptionText.setLineWrap(true);
        JScrollPane desScroll = new JScrollPane(descriptionText);

        final JTextArea descriptionSearch = new JTextArea(15,15);
        descriptionText.setLineWrap(true);
        JScrollPane desScrollSearch = new JScrollPane(descriptionSearch); //Same reason as Amount Search

        JLabel productList = new JLabel("Product List:", JLabel.LEFT);

        final JTextArea productListText = new JTextArea(printList(PL));
        productListText.setLineWrap(true);
        JScrollPane prodScroll = new JScrollPane(productListText);
        JButton addButton = new JButton("Add"); // Add button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int amt = Integer.parseInt(amountText.getText()); //Transfer it into integer
                PL.add(new Product(productText.getText(), amt, descriptionText.getText())); // Add new product
                productListText.setText(printList(PL)); // print the list again
            }
        });
        JButton remButton = new JButton("Remove");  // Remove button
        remButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Product p: PL){
                if (productText.getText().equals(p.getName())) // if found, remove it from list
                    PL.remove(p);
                }
                productListText.setText(printList(PL)); // reprint the list to the JTextArea
            }
        });
        JButton seaButton = new JButton("Search"); // Search button
        seaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Product p: PL){
                    if (productSearch.getText().equals(p.getName())) //if found
                    {
                        amountSearch.setText(String.valueOf(p.getAmt())); // print amount
                        descriptionSearch.setText(p.getDes());} // print value
                }

            }
        });

        //nah just run, don't read

        gr.setVerticalGroup(gr.createSequentialGroup()
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(productName).addComponent(productText).addComponent(productList))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(amount).addComponent(amountText).addComponent(prodScroll))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(description).addComponent(desScroll))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(addButton).addComponent(remButton))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(productName2).addComponent(productSearch))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(amount2).addComponent(amountSearch))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(description2).addComponent(desScrollSearch))
        .addGroup(gr.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(seaButton)));

        gr.setHorizontalGroup(gr.createSequentialGroup()
                .addGroup(gr.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(productName).addComponent(amount).addComponent(description).addComponent(addButton).addComponent(productName2).addComponent(amount2).addComponent(description2).addComponent(seaButton))
                .addGroup(gr.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(productText).addComponent(amountText).addComponent(desScroll).addComponent(remButton).addComponent(productSearch).addComponent(amountSearch).addComponent(desScrollSearch))
                .addGroup(gr.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(productList).addComponent(prodScroll)));

        frame.pack();
        frame.setVisible(true);
    }
    public String printList(ArrayList<Product> PL){ // method to print the list
        String data = "";
        for (Product p: PL){
            data += p.getName() + "\t" + p.getAmt() + "\n";
        }
        return data;
    }

}
