package Class;

import GUI.*;
import java.util.*;

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
    //menyimpan username dan password user baru
    public void CreateUser(String user, String pass){
        User u = new User(user, pass);
        d.saveUser(u);
    }
    
    public void CreateMotor(String user, Motor m){
        
        d.saveEngine(m.getEngine());
        d.saveBody(m.getBody());
        d.saveTires(m.getTires());
        d.saveMotor(m, m.getEngine(), m.getBody() ,m.getTires());       
        
        d.saveKepemilikan(user, m.getNama());
    }
    
    public void UpdateMotor(Motor M){
        
        d.updateBody(M.getBody());
        d.updateEngine(M.getEngine());
        d.updateTires(M.getTires());
    }
    
    public void DeleteMotor(String m){
        d.deleteKepemilikanMotor(m);
        d.deleteMotor( d.loadMotorId(m) );
    }
    
    public void DeleteUser(String u){
        d.deleteKepemilikanUser(u);
        d.deleteUser(  d.loadUserId(u) );
    }
    
    public void DeleteMotorKepemilikan (String m, String u){
        if( d.CekKepemilikan(m) ){
            d.deleteKepemilikanMotor(m);
        }else
            d.deleteKepemilikanUserMotor(u,m);
    }
    
//CEK data            
    public Boolean CekPerson(String input, String user, String pass){
        return d.CekPerson(input, user, pass);
    }
    
    public Boolean CekMotor(String nama){
        return d.CekMotor(nama);
    }
    
    
    public int getLastId(String input){
        return ( d.getLastId(input) + 1);
    }
    
    public ArrayList<String> getMotorList(String user){
        return d.loadMotorList(user);
    }
    
    public ArrayList<String> getUserList(){
        return d.loadUserList();
    }
    
    public String getMotorKomponen(Motor m){
        return ( m.toString() + m.toStringKomponen() ) ;
    }
 
    public Motor getMotor( String nama ){
        return d.loadMotorId(nama);
    }
    
    public User getUser( String nama ){
        return d.loadUserId(nama);
    }
}