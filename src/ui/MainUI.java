package ui;

import entities.ShoppingCart;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainUI extends JFrame {

    private ShoppingCart cart;
    private JLabel label;
    private ButtonGroup bGroup;
    private JRadioButton smartPhones, laptops, tablets;
    private JButton shoppingCart;
    private JPanel cPanel, lPanel;
    private GridLayout gridL;

    public MainUI() {
        
        gridL = new GridLayout(3, 3);
        cart = new ShoppingCart();
        cart.setVisible(false);

        cPanel = new JPanel();
        lPanel = new JPanel();
        lPanel.setLayout(new FlowLayout(1, 1, 1));
        cPanel.setLayout(gridL);

        label = new JLabel("Categories");

        bGroup = new ButtonGroup();

        smartPhones = new JRadioButton("Smart Phones");
        laptops = new JRadioButton("Laptops");
        tablets = new JRadioButton("Tablets");

        shoppingCart = new JButton("Shopping Cart");
        shoppingCart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cart.setVisible(true);
            }
        });

        lPanel.add(label);
        lPanel.add(smartPhones);
        lPanel.add(laptops);
        lPanel.add(tablets);
        lPanel.add(shoppingCart);

        bGroup.add(smartPhones);
        bGroup.add(laptops);
        bGroup.add(tablets);

        this.setLayout(new BorderLayout(1, 1));
        this.add(cPanel, BorderLayout.CENTER);
        this.add(lPanel, BorderLayout.WEST);
        
        this.setSize(600, 400);
        this.setVisible(true);
    }
}
