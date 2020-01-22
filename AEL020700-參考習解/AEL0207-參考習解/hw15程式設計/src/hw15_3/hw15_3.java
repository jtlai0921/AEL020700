package hw15_3;
import java.sql.*;
import javax.swing.*;

public class hw15_3 {

    public static void main(String[] args)
    {
        try
        {
     	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(ClassNotFoundException ce)
        {
     	   System.out.println("JDBC沒有驅動程式" + ce.getMessage());
     	   return ;
        }
        
        
        
        String uid = JOptionPane.showInputDialog("請輸入帳號").replace("'", "''");
        String  pwd= JOptionPane.showInputDialog("請輸入密碼").replace("'", "''");

        
        try
        {
           Connection cn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample");
           Statement sm = cn.createStatement();
           ResultSet rs = sm.executeQuery("SELECT * FROM 會員 WHERE 帳號='" + uid +
        		   "' AND 密碼='" + pwd + "'" );
           ResultSetMetaData rsmd = rs.getMetaData();
           System.out.println();
           if (rs.next())
           {
               System.out.print("帳號：" + rs.getString(1) + "\n密碼："
            		   +  rs.getString(2) + "\n姓名："
            		   +  rs.getString(3) + "\n生日：" 
            		   +  rs.getString(4) + "\n");
           }else{
               System.out.print("你不是會員，登入失敗");
           }
           sm.close();
           cn.close();
        }
        catch(SQLException e)
        {
        	System.out.println("資料庫連接失敗\n" + e.getMessage());
        }
    }

}
