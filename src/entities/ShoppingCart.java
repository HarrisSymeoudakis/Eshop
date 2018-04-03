/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Harris
 */
public class ShoppingCart extends JFrame {

    private JScrollPane scrollP;
    private JPanel panel;
    private JButton proc,rem;

    public ShoppingCart() {
        scrollP = new JScrollPane();
        panel = new JPanel();
        scrollP.getViewport().add(panel);
        
        proc = new JButton("Proceed Order");
        rem = new JButton("Remove All");

        this.setSize(400, 200);
        this.setLayout(new BorderLayout(1, 1));
        this.add(scrollP);
        
        this.add(proc,BorderLayout.SOUTH);
        this.add(rem,BorderLayout.SOUTH);
        
    }
}
