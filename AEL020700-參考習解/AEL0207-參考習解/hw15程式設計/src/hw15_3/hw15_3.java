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
     	   System.out.println("JDBC�S���X�ʵ{��" + ce.getMessage());
     	   return ;
        }
        
        
        
        String uid = JOptionPane.showInputDialog("�п�J�b��").replace("'", "''");
        String  pwd= JOptionPane.showInputDialog("�п�J�K�X").replace("'", "''");

        
        try
        {
           Connection cn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=sample");
           Statement sm = cn.createStatement();
           ResultSet rs = sm.executeQuery("SELECT * FROM �|�� WHERE �b��='" + uid +
        		   "' AND �K�X='" + pwd + "'" );
           ResultSetMetaData rsmd = rs.getMetaData();
           System.out.println();
           if (rs.next())
           {
               System.out.print("�b���G" + rs.getString(1) + "\n�K�X�G"
            		   +  rs.getString(2) + "\n�m�W�G"
            		   +  rs.getString(3) + "\n�ͤ�G" 
            		   +  rs.getString(4) + "\n");
           }else{
               System.out.print("�A���O�|���A�n�J����");
           }
           sm.close();
           cn.close();
        }
        catch(SQLException e)
        {
        	System.out.println("��Ʈw�s������\n" + e.getMessage());
        }
    }

}
