package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JComboBox religion, category, occupation, education, income;
    JRadioButton male, female, syes, sno, other,eyes,eno;
    JButton next;
    String formno;

    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails =new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,275,40);
        add(additionalDetails);

        JLabel name =new JLabel("Religion");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String[] valreligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valreligion);
        religion.setBounds(300,140,200,30);
        religion.setBackground(Color.white);
        add(religion);


        JLabel fname =new JLabel("Category");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);

        String[] valcategory = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,200,30);
        category.setBackground(Color.white);
        add(category);


        JLabel dob =new JLabel("Income");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,250,150,30);
        add(dob);

        String[] valincome = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300,250,200,30);
        income.setBackground(Color.white);
        add(income);


        JLabel gender =new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,300,150,30);
        add(gender);



        JLabel email =new JLabel("Qualification");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,325,150,30);
        add(email);

        String[] educationValues = {"Non - Graduation", "Graduate", "Post - Graduate", "Doctorate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,320,200,30);
        education.setBackground(Color.white);
        add(education);



        JLabel marital =new JLabel("Occupation");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);

        String[] occupationValues = {"Salaried", "Self - Employed", "Business", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,200,30);
        occupation.setBackground(Color.white);
        add(occupation);

        JLabel address =new JLabel("PAN Number");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);

        pan =new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(300,440,400,30);
        add(pan);


        JLabel city =new JLabel("Aadhaar Number");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,160,30);
        add(city);

        aadhar =new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel state =new JLabel("Senior Citizen");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(440,540,100,30);
        add(sno);


        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);


        JLabel pincode =new JLabel("Existence Account");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,180,30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(440,590,100,30);
        add(eno);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setForeground(Color.white);
        next.setBackground(Color.blue);
        next.setBounds(675,690,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {


        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = "";
        if (syes.isSelected()){
        seniorcitizen="Yes";
        }else if (sno.isSelected()){
            seniorcitizen="No";
        }
//        String email = emailTextField.getText();
        String existingaccount = "";
        if (eyes.isSelected()){
            existingaccount = "Yes";
        }else if (eno.isSelected()){
            existingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();

        try {
            if (span.equals("")){
                JOptionPane.showMessageDialog(SignupTwo.this, "PAN Number is Required");
            }else if (saadhar.equals("")){
                JOptionPane.showMessageDialog(SignupTwo.this, "Aadhaar Number is Required");
            }else if (seniorcitizen.equals("")){
                JOptionPane.showMessageDialog(SignupTwo.this, "Choose Yes/No in Senior Citizen");
            }else if (existingaccount.equals("")){
                JOptionPane.showMessageDialog(SignupTwo.this, "Choose Yes/No in Existence Account");
            }else {


                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "' , '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '" + seniorcitizen + "','" + existingaccount + "')";
                c.s.executeUpdate(query);//dml command

                //Signup3 Object
                setVisible(false);
                new SignupThree(formno);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}

