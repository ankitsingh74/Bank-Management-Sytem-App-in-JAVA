package bank.mangement.system;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField  pinTextField ;

    Login (){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward" ,Font.BOLD,38));
        text.setBounds(225,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card no:");
        cardno.setFont(new Font("Raleway" ,Font.BOLD,28));
        cardno.setBounds(120,150,150,40);//150+40=190(Y+H), 120+150=270(X+WD)
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial",Font.BOLD,18));
        cardTextField.setBounds(300,160, 250, 30);//270(total X)<300(X assumed)(300-270 GAP FROM CARD NO:)
        add(cardTextField);


        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway" ,Font.BOLD,28));
        pin.setBounds(120,220,150,30);//190(Y)>220(Y assumed)(220-190 GAP FROM PIN:), 120+150=270(X+WD)
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Arial",Font.BOLD,20));
        pinTextField.setBounds(300,220, 250, 30);//270(total X)<300(X assumed)(300-270 GAP FROM PIN:)),220+30(Y+H)=250
        add(pinTextField);

        login = new JButton(("SIGN IN"));
        login.setBounds(305,290,100,30);//250(total Y)<290(Y assumed)(290-250 GAP FROM PIN:)305+100=405(X+WD)
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton(("CLEAR"));
        clear.setBounds(445,290,100,30);//405 total X)<445(X assumed)(445-405 GAP FROM login) 290+30=320(Y+H)
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton(("SIGN UP"));
        signup.setBounds(305,350,240,30);//320(total Y)<350(Y assumed)(350-320 GAP FROM SIGN IN= CLEAR )
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.white);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == clear){
    cardTextField.setText("");
    pinTextField.setText("");
}else if (ae.getSource() == login){
 Conn conn = new Conn();
 String cardnumber = cardTextField.getText();
 String pinnumber = pinTextField.getText();
 String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";

 try{
ResultSet rs = conn.s.executeQuery(query);//ddl command
     if(rs.next()){
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
     }else if(cardnumber.equals("") && pinnumber.equals("")){
         JOptionPane.showMessageDialog(null, "Please Enter Card Number and PIN");
     }
     else{
         JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
     }

 }catch (Exception e){
     System.out.println(e);
 }


}else if (ae.getSource() == signup){
    setVisible(false);
    new SignupOne().setVisible(true);
}
    }
}
