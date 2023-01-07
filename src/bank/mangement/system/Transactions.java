package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit, fastcash, pinchange, withdrawal, ministatement, balanceenquiry, exit;
    String pinnumber;

    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,960,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel ("Please select your Transaction");
        text.setBounds(235, 300, 700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(350, 415, 150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(350, 450, 150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(350, 485, 150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit = new JButton("Exit");
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
    System.exit(0);
}else if(ae.getSource() == deposit){
    setVisible(false);
    new Deposit(pinnumber).setVisible(true);
}else if (ae.getSource() == withdrawal){
    setVisible(false);
    new Withdrawal(pinnumber).setVisible(true);
}else if(ae.getSource() == fastcash){
    setVisible(false);
    new FastCash(pinnumber).setVisible(true);
}else if(ae.getSource() == pinchange){
    setVisible(false);
    new PinChange(pinnumber).setVisible(true);
}else if(ae.getSource() == balanceenquiry){
    setVisible(false);
    new BalanceEnquiry(pinnumber).setVisible(true);
}else if (ae.getSource() == ministatement){
    new MiniStatement(pinnumber).setVisible(true);
}

    }

    public static void main(String[] args) {
        new Transactions("");
    }

}
