
package Project;
import java.sql.*;

public class ConnectionProvider {
    
    public static Connection getCon(){
    try{
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","root","pass123");
        return con;
    }catch(Exception e){
        return null;
    }
    }
}
