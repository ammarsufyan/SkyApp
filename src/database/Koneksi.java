package database;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    
    Connection conn;
    
    public Connection getConSQL(){
        try{
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=db_skyapp;user=sa;password=NotFound";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database Tidak Terkoneksi", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        return conn;
    }
}

