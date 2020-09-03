
package MainPackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import javax.swing.JOptionPane;
public class DBConnect 
{
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public static Connection ConnectDB()
    {
    String unicode = "?useUnicode=yes&characterEncoding=UTF-8";   
    String url ="jdbc:mysql://localhost:3306/";
    String DbName ="redngreenchillijava";
    String Driver ="com.mysql.jdbc.Driver";
    String Username ="root";
    String Password ="";
    try{
    Class.forName(Driver);
    Connection conn = DriverManager.getConnection(url+DbName+unicode,Username,Password);
   
    return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e+"(There is an issue in connecting database)");
            Login.ConMessage="Database Connection Failed!";
        }
        return null;
    }
    
    
}
