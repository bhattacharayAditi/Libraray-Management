/*
* connection code
* connective mysql using JDBC API
 */
package library.management.system;
import java.sql.*; //import to use JDBC classes and interfaces
public class conn{
    Connection c;// connection interface
    Statement s; // statement interface
    public conn(){  //constructor
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  //register the driver class.
            c =DriverManager.getConnection("jdbc:mysql:///libraryproject","root","");  //create connection
            s =c.createStatement();  //create statement
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
