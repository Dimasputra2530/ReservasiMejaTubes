/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasimeja;

/**
 *
 * @author Dimas
 */

import java.util.Date;

public class Reservasi {
    private String id_Reservasi;
    private Date tanggal;
    private String waktu;
    private int nomorMeja;
    private int jumlahOrang;
    private String status;

    public Reservasi(String id_Reservasi, Date tanggal, String waktu, int nomorMeja, int jumlahOrang, String status) {
        this.id_Reservasi = id_Reservasi;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.nomorMeja = nomorMeja;
        this.jumlahOrang = jumlahOrang;
        this.status = status;
    }

    public void buatReservasi() {
        this.status = "Dibuat";
    }

    public void batalkanReservasi() {
        this.status = "Dibatalkan";
    }

    public void ubahReservasi() {
        this.status = "Diubah";
    }
}
