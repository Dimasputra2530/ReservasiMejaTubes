/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasimeja;

/**
 *
 * @author Dimas
 */

public class Pengguna {
    protected String id_pengguna;
    protected String username;
    protected String password;
    protected String email;
    protected String nomorHp;

    public Pengguna(String id_pengguna, String username, String password, String email, String nomorHp) {
        this.id_pengguna = id_pengguna;
        this.username = username;
        this.password = password;
        this.email = email;
        this.nomorHp = nomorHp;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}
