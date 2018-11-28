package Class;

import GUI.*;
import java.util.*;

public class Application {
    
    //private Login l = new Login();
    private PilihMotor p = new PilihMotor();
    private ViewMotorUser v = new ViewMotorUser();
    private Database d = new Database();
    
    private ArrayList<Admin> u;
    
    public Application(){}
    
    //menyimpan username dan password user baru
    public void CreateUser(String user, String pass){
        Admin u = new Admin(user, pass);
        d.saveAdmin(u);
    }
    
    //user mengajukan custom motor yang dibuat
    public void PengajuanCustom(){
        
    }
    
    //menerima pengajuan custom motor dari user
    public void Accept(){
        
    }
    
    //menghapus motor yang diinginkan
    public void DeleteMotor(){
        
    }    
    
    //melakukan pembaruan pada motor yang ada
    public void Update(){
    }
    
    //menampilkan list motor yang ada
    public void View(){
        
    }
    
    public void GUI(){
        //p.setVisible(true);
       v.setVisible(true);
    }
}