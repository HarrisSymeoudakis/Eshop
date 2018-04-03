package ui;

import entities.Customer;
import eshop.EShopIntf;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;


public class RegisterFrame extends JFrame{
    
    private EShopIntf intf;
    private JTextField text1,text2,text3,text4,text5,text6,text7;
    private JCheckBox checkbox;
    
    public RegisterFrame(EShopIntf i) {
        intf = i;
        createFrame();
    }
    
    public void createFrame(){
        
        this.setSize(600, 600);
        this.setTitle("RegisterFrame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        GridLayout layout = new GridLayout(17,17);
        panel.setLayout(layout);

        this.add(panel);
        
        JLabel label = new JLabel();
        label.setText("Register");
        
        panel.add(label);
        
        JPanel panel3 = new JPanel();
        
        JPanel panel4 = new JPanel();
        
        JPanel panel5 = new JPanel();
        
        JPanel panel6 = new JPanel();
        
        JPanel panel7 = new JPanel();
        
        JPanel panel8 = new JPanel();

        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6 );
        panel.add(panel7);
        panel.add(panel8);
        
        
       
        JLabel label1 = new JLabel();
        label1.setText("Name");
        
        panel.add(label1);
        
        text1= new JTextField();
        
        panel.add(text1);
        
        JLabel label2 = new JLabel();
        label2.setText("Email");
       
        panel.add(label2 );
        
        text4= new JTextField();
        
        panel.add(text4);

        
        JLabel label3 = new JLabel();
        label3.setText("Username");
        
        panel.add(label3);
        
        text2= new JTextField();
        
        panel.add(text2);
        
        JLabel label4 = new JLabel();
        label4.setText("Password");
       
        panel.add(label4 );
        
        text3= new JTextField();

        panel.add(text3 );

        
        JLabel label5 = new JLabel();
        label5.setText("Birthdate");
        
        panel.add(label5);
        
        text5= new JTextField();
        
        panel.add(text5);
        
        
        JLabel label6 = new JLabel();
        label6.setText("Address");
       
        
        panel.add(label6 );
        
        text6= new JTextField();
        
        panel.add(text6);
        
        JLabel label7 = new JLabel();
        label7.setText("Telephone");
       
        
        panel.add(label7 );
        
        text7= new JTextField();
        
        panel.add(text7);
        
        checkbox = new JCheckBox();
        checkbox.setText("Newsletter Updates");
        
        panel.add(checkbox);
        
        
        JButton button = new JButton();
        panel.add(button);
        button.add(label);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = text1.getText();
                String uname = text2.getText();
                String pass = text3.getText();
                String email = text4.getText();
                String add = text6.getText();
                String phone = text7.getText();
                boolean n = checkbox.isSelected();
                Date bdate = new Date();

                Customer c = new Customer(add, add, bdate, n, name, uname, phone, email, pass, new Date());
                intf.addUser(c);
                exit();
            }
        });
        this.setResizable(false);
        this.setVisible(true);
    }
    
    private void exit(){
        this.dispose();
    }

    
}