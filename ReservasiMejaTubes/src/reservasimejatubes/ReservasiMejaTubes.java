/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasimejatubes;

/**
 *
 * @author Dimas
 */
import java.sql.*;



public class ReservasiMejaTubes{
    public static void main(String[] args) {
//        new TestPanels().setVisible(true);
        new LoginPanel().setVisible(true);
        ReservasiMejaTubes app = new ReservasiMejaTubes();

        if (!app.loadData()) {
            System.out.println("Failed to load data. Exiting program.");
            return; 
        }
    }
    
    public boolean loadData() {
        try {
            Connection connection = DatabaseConnection.getConnection();
            Statement statement = connection.createStatement();
            System.out.println("Connected to the database.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
