/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Connect;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 84384
 */
public class JavaApplication8 {
    String server = "MSI\\SQLEXPRESS";
    String user = "sa";
    String password = "nguyenanhviet";
    String db = "QuanLyCongXuong";
    int port = 1433;
    public Connection getConnection(){
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setPortNumber(port);
        ds.setServerName(server);
        ds.setEncrypt(false);
        try ( Connection conn = ds.getConnection()) {
            System.out.println(conn.getCatalog());
            return conn;
        } catch (SQLException ex) {     
             ex.printStackTrace();
        }
        return null;
    } 
    public static void main(String[] args) {
        JavaApplication8 jv= new JavaApplication8();
        Connection cnn= jv.getConnection();
        if(cnn==null){
            System.err.println("wrong");
        } else {
            System.out.println("true");
        }
    }
    
}
