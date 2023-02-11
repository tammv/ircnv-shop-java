/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Connect;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author 84384
 */
public class ConnectSQL {

    String server = "MSI\\SQLEXPRESS";
    String user = "sa";
    String password = "nguyenanhviet";
    String db = "SpiderShop";
    String port = "1433";
    String instance = "";

    public Connection getConnect() throws Exception {
        String url = "jdbc:sqlserver://" + server + ":" + port + "\\" + instance + ";databaseName=" + db;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + server + ":" + port + "\\" + ";databaseName=" + db;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, user, password);
    }
    public static void main(String[] args) {
        ConnectSQL cnSQL= new ConnectSQL();
        try {
            Connection cnn= cnSQL.getConnect();
            System.out.println("thanh cong");
        } catch (Exception e) {
            System.err.println("that bai");
        }
        
    }
}
