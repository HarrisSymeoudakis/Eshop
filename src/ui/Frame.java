package ui;

import eshop.EShopIntf;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame {

    private JFrame frame;
    private EShopIntf intf;
    
    private JTextField text1,text2;
    
    public Frame(EShopIntf i) {
        
        intf = i;
        
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label = new JLabel();
        label.setText("                                    Register");
        
        panel.add(label);
        
        JPanel panel3 = new JPanel();
        panel3.setName("Username");
        
        JPanel panel4 = new JPanel();
        panel4.setName("Password");
        
        panel.add(panel3);
        panel.add(panel3 );
        
         JLabel label1 = new JLabel();
        label1.setText("Username");
        
        panel.add(label1);
        
        text1= new JTextField();
        
        panel.add(text1);
        
        
        
        JLabel label2 = new JLabel();
        label2.setText("Password");
       
        
        panel.add(label2 );
        
        

        text2= new JTextField();

        
        panel.add(text2 );
        
        JButton button = new JButton();
        panel.add(button);
        button.add(label);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                intf.register();
            }
        });
        
        JButton button1 = new JButton();
        panel.add(button1);
        button1.setText("Login");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intf.login(text1.getText(), text2.getText());
            }
        });
        
        GridLayout layout = new GridLayout(8,8);
        panel.setLayout(layout);
        
        
        
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
    public void dispoceF(){
        frame.dispose();
    }
    
}
