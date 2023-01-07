package bank.mangement.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {
            //Class.forName(com.mysql.cj.jdbc.Driver);//this new version of not required for jdbc connection
             c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Ankit@2297");
             s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
