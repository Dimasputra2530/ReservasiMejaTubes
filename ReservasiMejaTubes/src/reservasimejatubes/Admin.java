/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasimejatubes;

/**
 *
 * @author Dimas
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Admin extends JPanel {
    // Deklarasi variabel
    private JButton jButton6;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    public Admin() {
        initComponents(); // Panggil initComponents
    }

    private void initComponents() {
        // Inisialisasi komponen
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel1 = new JLabel();
        jButton6 = new JButton();

        // Konfigurasi tabel
        jTable1.setModel(new DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Nama", "Data 1", "Data 2"}
        ));
        jScrollPane1.setViewportView(jTable1);

        // Konfigurasi label
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Admin Panel");

        // Konfigurasi tombol
        jButton6.setText("Logout");
        jButton6.addActionListener(evt -> logoutActionPerformed(evt));

        // Tata letak
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Logout berhasil!");
        System.exit(0);
    }

    void switchPanel(String dashboardPanel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
