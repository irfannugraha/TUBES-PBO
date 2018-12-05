package Application;

import Class.Database;
import Class.Motor;
import Class.User;
import java.util.*;
import javax.swing.JOptionPane;

public class Application {
    
    private User u;
    private Motor m;
    private Database d;
    
    private int idM = 0;
    
    public Application(){
        d = new Database();
        
        d.connect();
    }
//Kelola Data    
    //membuat USER baru, menyimpan USERNAME dan PASSWORD
    public void CreateUser(String user, String pass){
        User u = new User(user, pass);
        d.saveUser(u);
    }
    //membuat MOTOR baru, dan membuat RELASI ke USER
    public void CreateMotor(String user, Motor m){
        
        d.saveEngine(m.getEngine());
        d.saveBody(m.getBody());
        d.saveTires(m.getTires());
        d.saveMotor(m, m.getEngine(), m.getBody() ,m.getTires());       
        
        d.saveKepemilikan(user, m.getNama(), 1);
    }
    //memperbarui KOMPONEN motor
    public void UpdateMotor(Motor M, String nama){
        if(d.CekKepemilikanEditable(M.getNama()) == true){
            d.updateBody(M.getBody());
            d.updateEngine(M.getEngine());
            d.updateTires(M.getTires());
        }
    }
    //menghapus MOTOR dan RELASINYA
    public void DeleteMotor(String m){
        d.deleteKepemilikanMotor(m);
        d.deleteMotor( d.loadMotorId(m) );
    }
    //menghapus USER dan RELASINYA
    public void DeleteUser(String u){
        d.deleteKepemilikanUser(u);
        d.deleteUser(  d.loadUserId(u) );
    }
    //menghapus RELASI antara motor dan user
    public void DeleteMotorKepemilikan (String m, String u){
        if( d.CekKepemilikan(m) ){
            d.deleteKepemilikanMotor(m);
        }else
            d.deleteKepemilikanUserMotor(u,m);
        JOptionPane.showMessageDialog(null, "Delete berhasil");
    }
    
//CEK data    
    //memeriksa data USER atau ADMIN berdasatkan USERNAME
    public Boolean CekPerson(String input, String user, String pass){
        return d.CekPerson(input, user, pass);
    }
    //memeriksa data MOTOR berdasarkan NAMA MOTOR
    public Boolean CekMotor(String nama){
        return d.CekMotor(nama);
    }
    
    //mendapatkan data ID TERAKHIR suatu data
    public int getLastId(String input){
        return ( d.getLastId(input) + 1);
    }
    //mendapatkan list MOTOR suatu USER
    public ArrayList<String> getMotorList(String user){
        return d.loadMotorList(user);
    }
    //mendapatkan list USER
    public ArrayList<String> getUserList(){
        return d.loadUserList();
    }
    //mendapatkan KOMPONEN suatu motor
    public String getMotorKomponen(Motor m){
        return ( m.toString() + m.toStringKomponen() ) ;
    }
    //mendapatkan MOTOR berdasarkan NAMA MOTOR
    public Motor getMotor( String nama ){
        return d.loadMotorId(nama);
    }
    //mendapatkan USER berdasarkan USENAME
    public User getUser( String nama ){
        return d.loadUserId(nama);
    }
}