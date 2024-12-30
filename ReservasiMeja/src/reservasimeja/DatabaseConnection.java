/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasimeja;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class DatabaseConnection {

    private String url = "jdbc:mysql://localhost/db_reservasi";
    private String username = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
    
}
