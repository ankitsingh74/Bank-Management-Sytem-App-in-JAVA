package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;



public class SignupOne extends JFrame implements ActionListener {

    int random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField,  stateTextField, pinTextField, countryTextField;
    JDateChooser dateChooser;
    JComboBox cstate;
    JRadioButton male, female, married, unmarried, other;
    JButton next;

    SignupOne(){

        setLayout(null);

        Random  ran = new Random();
        random = Math.abs(ran.nextInt()%1000)+1000;
        JLabel formno =new JLabel("APPLICATION FORM NO. " +random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails =new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,275,40);
        add(personalDetails);

        JLabel name =new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField =new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,16));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);


        JLabel fname =new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);

        fnameTextField =new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,16));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);


        JLabel dob =new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,150,30);
        add(dob);

        dobTextField =new JTextField();
        dobTextField.setFont(new Font("Raleway",Font.BOLD,16));
        dobTextField.setBounds(300,240,100,30);
        add(dobTextField);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,120,29);
        add(dateChooser);

        JLabel gender =new JLabel("Gender");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,150,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400,290,80,30);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email =new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,150,30);
        add(email);

        emailTextField =new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);


        JLabel marital =new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(440,390,100,30);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(580,390,100,30);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address =new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);

        addressTextField =new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);


        JLabel city =new JLabel("City");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);

        cityTextField =new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
        cityTextField.setBounds(300,490,200,30);
        add(cityTextField);


        JLabel state =new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);

//        stateTextField =new JTextField();
//        stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
//        stateTextField.setBounds(300,540,200,30);
//        add(stateTextField);

        String[] valstate =  {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry"};
        cstate = new JComboBox(valstate);
        cstate.setBackground(Color.white);
        cstate.setBounds(300,540,220,30);
        add(cstate);//........................................................................................................................................................


        JLabel pincode =new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,150,30);
        add(pincode);

        pinTextField =new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,20));
        pinTextField.setBounds(300,590,150,30);
        add(pinTextField);


        JLabel country =new JLabel("Country:");
        country.setFont(new Font("Raleway",Font.BOLD,20));
        country.setBounds(100,640,150,30);
        add(country);

        countryTextField =new JTextField();
        countryTextField.setFont(new Font("Raleway",Font.BOLD,18));
        countryTextField.setBounds(300,640,200,30);
        add(countryTextField);

//        String[] valstate =  {"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};
//
//        countryChooser = new JComboBox(valstate);
//        countryChooser.setBounds(300,640,220,30);
//        add(countryChooser);

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
        //nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField,  stateTextField, pinTextField, countryTextField;

        String formno ="" + random;//int to string typecast
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender ="";
        if (male.isSelected()){
            gender="Male";
        }else if (female.isSelected()){
            gender="Female";
        }

        String email = emailTextField.getText();
        String marital = "";
        if (married.isSelected()){
            marital = "Married";
        }else if (unmarried.isSelected()){
            marital = "Unmarried";
        }else if (other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String scstate = (String) cstate.getSelectedItem();

        String pincode = pinTextField.getText();
        String country = countryTextField.getText();


        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");//you can pass null/ConstructorName.this for check JTextField
            }
            else  if (fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is Required");
            }
            else if (dob.equals("")){
                JOptionPane.showMessageDialog(SignupOne.this, "Date of Birth is Required");
            }
            else if (gender.equals("")){
                JOptionPane.showMessageDialog(SignupOne.this, "Gender is Required");//you can pass Only ConstructorName.this for check JRadioButton...VVI
            }
           else if (email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required");
            }else if (marital.equals("")){
                JOptionPane.showMessageDialog(SignupOne.this, "Marital Status is Required");
            }
           else if (address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            else if (city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            else if (pincode.equals("")){
                JOptionPane.showMessageDialog(null, "Pincode is Required");
            }
            else if (country.equals("")){
                JOptionPane.showMessageDialog(null, "Country is Required");
            }else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"' , '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+scstate+"', '"+pincode+"', '"+country+"')";
            c.s.executeUpdate(query);//dml command
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }

        }catch (Exception e){
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
