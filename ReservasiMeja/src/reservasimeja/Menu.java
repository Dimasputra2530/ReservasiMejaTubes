/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasimeja;

/**
 *
 * @author Dimas
 */
public class Menu {
    private String id_Menu;
    private String namaMenu;
    private double harga;
    private String kategori;
    private String deskripsi;

    public Menu(String id_Menu, String namaMenu, double harga, String kategori, String deskripsi) {
        this.id_Menu = id_Menu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
    }

    public void tampilkanMenu() {
        System.out.println("Menu: " + namaMenu + " | Harga: " + harga);
    }
}
