/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import entities.ProductInOrder;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Harris
 */
public class ProductInOrderPanel {

    private JLabel title, price, quantity, total;
    private JButton add, sub, rem;
    private ProductInOrder pio;

    public ProductInOrderPanel(ProductInOrder p) {
        pio = p;

        title.setText(pio.getProduct().getTitle());
        price.setText(pio.getProduct().getPrice() + "");
        quantity.setText(pio.getQuantity() + "");
        total.setText(pio.getTotalPrice()+"");

    }
}
