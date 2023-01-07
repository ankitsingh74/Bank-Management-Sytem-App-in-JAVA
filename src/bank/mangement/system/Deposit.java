package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
JTextField amount;
JButton deposit, back;
String pinnumber;

    Deposit(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,960,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel ("Enter the amount you want to Deposit");
        text.setBounds(170, 300, 700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);


        amount = new JTextField();
        amount.setFont(new Font("Ralway",Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);


        deposit = new JButton("Deposit");
        deposit.setBounds(350, 485, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);


        back = new JButton("Back");
        back.setBounds(350, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);


        setSize(900, 860);
        setLocation(300,1);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

  if(ae.getSource() == deposit){
   String number = amount.getText();
      Date date = new Date();
      try {

          if (number.equals("")) {
              JOptionPane.showMessageDialog(null, "Please enter amount you want to deposit");
          } else {
              Conn conn = new Conn();
              String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')";
              conn.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
          }
      }catch (Exception e) {
          System.out.println(e);
      }


} else if (ae.getSource() == back) {
      setVisible(false);
    new Transactions(pinnumber).setVisible(true);
}
    }

    public static void main(String[] args) {
        new Deposit("");

    }

}
