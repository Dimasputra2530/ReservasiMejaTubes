/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasimeja;

/**
 *
 * @author ASUS
 */
public class user {
    protected int id_user;
    protected String username;
    protected String password;
    protected String no_telp;
    protected int role;
    
    public user() {
        this.id_user = 0;
        this.username = "";
        this.password = "";
        this.no_telp = null;
        this.role = 0;
    }
    
    public user(String username, String password) {
        this.id_user = 0;
        this.username = username;
        this.password = password;
        this.no_telp = null;
        this.role = 0;
    }
    public user(String username, String password, String no_telp, int role) {
        this.id_user = 0;
        this.username = username;
        this.password = password;
        this.no_telp = no_telp;
        this.role = role;
    }
    
    public int getId_user() {
        return id_user;
    }
    
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNo_telp() {
        return no_telp;
    }
    
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
    public int getRole() {
        return role;
    }
    
    public void setRole(int role) {
        this.role = role;
    }
}

