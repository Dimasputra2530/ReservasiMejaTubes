/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasimejatubes;

/**
 *
 * @author Dimas
 */

import java.awt.CardLayout;
import javax.swing.*;

//main
public class ReservasiMejaTubes extends JFrame {
    JFrame frame;
    CardLayout cardLayout;
    JPanel mainPanel;

    // Deklarasi Panel
    LoginPanel loginPanel;
    MenuPanel menuPanel;
    AdminPanel adminPanel;
    PelangganPanel pelangganPanel;
    ReservasiPanel reservasiPanel;
    
    public ReservasiMejaTubes() {
        // Membuat JFrame utama
        frame = new JFrame("Reservasi Meja Tubes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // Mengatur layout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        System.out.println("dimas putra");
        
        // Inisialisasi Panel
        loginPanel = new LoginPanel(this);
        menuPanel = new MenuPanel(this);
        adminPanel = new AdminPanel(this);
        pelangganPanel = new PelangganPanel(this);
        reservasiPanel = new ReservasiPanel(this);

        // Menambahkan Panel ke mainPanel
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(menuPanel, "Menu");
        mainPanel.add(adminPanel, "Admin");
        mainPanel.add(pelangganPanel, "Pelanggan");
        mainPanel.add(reservasiPanel, "Reservasi");

        // Menambahkan ke JFrame
        frame.add(mainPanel);
        cardLayout.show(mainPanel, "Login"); // Panel awal: LoginPanel
        frame.setVisible(true);
    }

    // Method untuk berpindah panel
    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ReservasiMejaTubes());
    }

    void AdminPanel(String admin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void PelangganPanel(String pelanggan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

  
