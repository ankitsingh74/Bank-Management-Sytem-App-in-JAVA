package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno){
this.formno=formno;
        setLayout(null);

        JLabel i1 = new JLabel("Page - 3: Account Details");
        i1.setFont(new Font("Raleway", Font.BOLD, 30));
        i1.setBounds(250, 40,400, 40);
        add(i1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 130,400, 40);
        add(type);


        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 22));
        r1.setBackground(Color.white);
        r1.setBounds(100, 180,300, 40);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account ");
        r2.setFont(new Font("Raleway", Font.BOLD, 22));
        r2.setBackground(Color.white);
        r2.setBounds(400, 180,300, 40);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 22));
        r3.setBackground(Color.white);
        r3.setBounds(100, 230,300, 40);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 22));
        r4.setBackground(Color.white);
        r4.setBounds(400, 230,350, 40);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);


        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 320,300, 40);
        add(card);

        JLabel number = new JLabel("5040-XXXX-XXXX-XXXX");
        number.setFont(new Font("Raleway", Font.BOLD, 25));
        number.setBounds(400, 320,300, 40);
        add(number);

        JLabel carddetails = new JLabel("Your 16 Digit Card Number");
        carddetails.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetails.setBounds(100, 350,300, 20);
        add(carddetails);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 380,300, 40);
        add(pin);

        JLabel pindetails = new JLabel("Your 4 Digit Pin");
        pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetails.setBounds(100, 410,300, 20);
        add(pindetails);

        JLabel Pnumber = new JLabel("XXXX");
        Pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        Pnumber.setBounds(400, 380,300, 40);
        add(Pnumber);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450,400, 40);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont((new Font("Raleway",Font.BOLD,16)));
        c1.setBounds(100,500,230,22);
        add(c1);

        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.white);
        c2.setFont((new Font("Raleway",Font.BOLD,16)));
        c2.setBounds(400,500,230,22);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.white);
        c3.setFont((new Font("Raleway",Font.BOLD,16)));
        c3.setBounds(100,540,230,22);
        add(c3);

        c4 = new JCheckBox("EMAIL AND SMS ALERT");
        c4.setBackground(Color.white);
        c4.setFont((new Font("Raleway",Font.BOLD,16)));
        c4.setBounds(400,540,230,22);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont((new Font("Raleway",Font.BOLD,16)));
        c5.setBounds(100,580,230,22);
        add(c5);

        c6 = new JCheckBox("E - Statement");
        c6.setBackground(Color.white);
        c6.setFont((new Font("Raleway",Font.BOLD,16)));
        c6.setBounds(400,580,230,22);
        add(c6);

        c7 = new JCheckBox("I hereby declared that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont((new Font("Raleway",Font.BOLD,12)));
        c7.setBounds(100,630,600,22);
        add(c7);

        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.white);
        submit.setBounds(230,690,100,40);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.white);
        cancel.setBounds(510,690,100,40);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.white);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);


    } @Override
    public void actionPerformed(ActionEvent ae) {//ActionListner

if (ae.getSource() == submit){//if action for submit JButton (first)
    String accounttype="";
    if (r1.isSelected()){
        accounttype="Saving Account";
    }else if (r2.isSelected()){
        accounttype="Fixed Deposit Account ";
    }else if (r3.isSelected()){
        accounttype="Current Account";
    }else if (r4.isSelected()){
        accounttype="Recurring Deposit Account";
    }

    Random random = new Random();
    String cardnumber = "" +Math.abs((random.nextLong() % 90000000L) + 5040936000000000L) ;//cardnumber random..................................

    String pinnumber = "" +Math.abs((random.nextLong() % 9000L)+1000);//pinnumber random........................................................

    String facility = "";
    if (c1.isSelected()){
        facility = facility + "ATM CARD";
    }else if (c2.isSelected()){
        facility = facility + "INTERNET BANKING";
    }else if (c3.isSelected()){
        facility = facility + "MOBILE BANKING";
    }else if (c4.isSelected()){
        facility = facility + "EMAIL AND SMS ALERT";
    }else if (c5.isSelected()){
        facility = facility + "Cheque Book";
    }else if (c6.isSelected()){
        facility = facility + "E - Statement";
    }

    try {
        if (accounttype.equals("")){
            JOptionPane.showMessageDialog(SignupThree.this, "Account Type Required");
        }else if (facility.equals("")){
            JOptionPane.showMessageDialog(SignupThree.this, "Choose any Services Required");
        }else if (!c7.isSelected()){
            JOptionPane.showMessageDialog(SignupThree.this, "Please tick checkbox for your declaration");
        }

        else {
            Conn conn = new Conn();
            String query1 = "insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
            String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            JOptionPane.showMessageDialog(null, "Card Number:" + cardnumber + "\n Pin: " +pinnumber);

            setVisible(false);
            new Deposit(pinnumber).setVisible(false);
        }

    }catch (Exception e){
        System.out.println(e);
    }

}else if (ae.getSource() == cancel){//else if for cancel JButton (last)
    setVisible(false);
    new Login().setVisible(true);
}
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

}
