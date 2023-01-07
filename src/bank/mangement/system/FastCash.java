package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener {


        JButton deposit, fastcash, pinchange, withdrawal, ministatement, balanceenquiry, exit;
        String pinnumber;

        FastCash(String pinnumber){
           this.pinnumber=pinnumber;
            setLayout(null);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(900,960,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0, 0, 900, 900);
            add(image);

            JLabel text = new JLabel ("SELECT WITHDRAWAL AMOUNT");
            text.setBounds(200, 300, 700,35);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("System", Font.BOLD,16));
            image.add(text);

            deposit = new JButton("Rs 100");
            deposit.setBounds(170, 415, 150,30);
            deposit.addActionListener(this);
            image.add(deposit);

            fastcash = new JButton("Rs 1000");
            fastcash.setBounds(170, 450, 150,30);
            fastcash.addActionListener(this);
            image.add(fastcash);

            pinchange = new JButton("Rs 5000");
            pinchange.setBounds(170, 485, 150,30);
            pinchange.addActionListener(this);
            image.add(pinchange);

            withdrawal = new JButton("Rs 500");
            withdrawal.setBounds(350, 415, 150,30);
            withdrawal.addActionListener(this);
            image.add(withdrawal);

            ministatement = new JButton("Rs 2000");
            ministatement.setBounds(350, 450, 150,30);
            ministatement.addActionListener(this);
            image.add(ministatement);

            balanceenquiry = new JButton("Rs 10000");
            balanceenquiry.setBounds(350, 485, 150,30);
            balanceenquiry.addActionListener(this);
            image.add(balanceenquiry);

            exit = new JButton("BACK");
            exit.setBounds(350, 519, 150,30);
            exit.addActionListener(this);
            image.add(exit);


            setSize(900, 860);
            setLocation(300,1);
            setUndecorated(true);
            setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == exit){
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
            }else {
                String amount =((JButton) ae.getSource()).getText().substring(3);//Removing "Rs " from Rs from Rs 100 by substring
                Conn c = new Conn();
                try {
                    ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                    int balance = 0;
                    while(rs.next()){
                        if(rs.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(rs.getString("amount"));
                        }else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    Date date = new Date();//import required
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited successfully");

                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }

        public static void main(String[] args) {
         new  FastCash("");
        }

    }

