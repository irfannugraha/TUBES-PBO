package Controller;

import Application.Application;
import Class.Database;
import Class.Motor;
import View.Login;
import View.ViewMotor;
import View.PilihMotor;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Controller implements ActionListener{
    private Application a;
    private Login l;
    private PilihMotor p;
    private ViewMotor vu;
    
    private String person = "";

    public Controller(Application a) {
        p = new PilihMotor();
        l = new Login();
        vu = new ViewMotor();
        this.a = a;
        
        l.setVisible(true);
        
        l.addActionListener(this);
        p.addActionListener(this);
        vu.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        //Login Pages
        if(source.equals( l.getLogIn_btn() )){
            vu.reset_pages();
            p.pagesReset();
            if( a.CekPerson("admin", l.getLogInUsername(), l.getLogInPassword() ) == true ){
                person = "admin";
                JOptionPane.showMessageDialog(null, "Selamat datang admin");
                l.setVisible(false);
                vu.setVisible(true);
                vu.setUserList( a.getUserList(), person );
                vu.setMotorAdminList( a.getMotorList(null) );
                vu.getUpdate_btn().setVisible(false);
            } else if( a.CekPerson("user", l.getLogInUsername(), l.getLogInPassword() ) == true ){
                person = "user";
                p.setVisible(true);
                p.toPilih();
                l.setVisible(false);
                p.getUpdate_btn().setVisible(false);
                p.getInput_btn().setVisible(true);
                vu.reset_pages();               
            } else
                JOptionPane.showMessageDialog(null, "Maaf, Username atau password anda salah");
            vu.set_pages(person);
        }
        
        if(source.equals( l.getSignUp_btn() )){
            if( a.CekPerson("user", l.getSignUpUsername(), null) == true || a.CekPerson("admin", l.getLogInUsername(), l.getLogInPassword() ) == true ){
                JOptionPane.showMessageDialog(null, "Maaf, username sudah dipakai");
            }else if( l.getSignUpPassword() == null || l.getSignUpUsername() == null){
                JOptionPane.showMessageDialog(null, "Anda belum mengisi");
            }else{
                a.CreateUser(l.getSignUpUsername(), l.getSignUpPassword());
                JOptionPane.showMessageDialog(null, "Terimakasih, telah bergabung");
                l.reset();
            }
        }
        
        //PilihMotor pages
        if(source.equals( p.getBtn_next() )){
            if( a.CekMotor( p.getNama() ) == true){
                p.Pilihto();
            }
            else
                JOptionPane.showMessageDialog(null, "Maaf, nama motor sudah dipakai");
        }
        
        if(source.equals( p.getInput_btn() )){
            if( p.cekData() == true ){
                Motor m = new Motor(p.getNama(), p.getMerk(), p.getJenis());
                m.CreateEngine(a.getLastId("engine"), p.getCC(), p.getKnalpot(), p.getCylinder());
                m.CreateBody(a.getLastId("body"), p.getBadan(), p.getTangki(), p.getHeadlamp(), p.getSeat(), p.getBadanColor());
                m.CreateTires( a.getLastId("tires"), p.getVelg(), p.getBan(), p.getDiameter(), p.getLebar(), p.getTiresColor() );
            
                a.CreateMotor(l.getLogInUsername(), m);
                JOptionPane.showMessageDialog(null, "Data anda telah diinput");
                
                p.pagesReset();
                p.toPilih();                
            }else
                JOptionPane.showMessageDialog(null, "Mohon masukan semua data");

        }
        
        if(source.equals( p.getBtn_penyimpanan() )){
            p.setVisible(false);
            vu.setVisible(true);
            vu.setUserList( a.getUserList(), person );
            vu.reset_pages();
        }
        
        if(source.equals( p.getUpdate_btn() )){
            Motor m = a.getMotor( vu.getMotor("user") );
            Database d = new Database();
            d.connect();
            if(d.CekKepemilikanEditable(m.getNama()) == true){
                m.CreateEngine( m.getEngine().getIdEngine(), p.getCC(), p.getKnalpot(), p.getCylinder());
                m.CreateBody( m.getBody().getIdBody(), p.getBadan(), p.getTangki(), p.getHeadlamp(), p.getSeat(), p.getBadanColor());
                m.CreateTires( m.getTires().getIdTires(), p.getVelg(), p.getBan(), p.getDiameter(), p.getLebar(), p.getTiresColor());
                a.UpdateMotor( m, l.getLogInUsername() );
            }else{
                String input = JOptionPane.showInputDialog(null, "Masukan nama baru : ");
                Motor n = new Motor(input, m.getMerk(), m.getJenis());
                n.CreateEngine( d.getLastId("engine")+1, p.getCC(), p.getKnalpot(), p.getCylinder());
                n.CreateBody( d.getLastId("body")+1, p.getBadan(), p.getTangki(), p.getHeadlamp(), p.getSeat(), p.getBadanColor());
                n.CreateTires( d.getLastId("tires")+1, p.getVelg(), p.getBan(), p.getDiameter(), p.getLebar(), p.getTiresColor());
                a.CreateMotor(l.getLogInUsername(), n);
            }
            JOptionPane.showMessageDialog(null, "Pembaruan Berhasil");
            p.pagesReset();
            p.toPilih();            
        }
        
        if(source.equals( p.getBtn_Exit() )){
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar", "", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){            
                p.setVisible(false);
                l.setVisible(true);
                l.reset();
            }
        }
        
        //ViewMotor pages
        //User
        if(source.equals( vu.getUpdate_btn() )){
            vu.setVisible(false);
            p.setVisible(true);
            p.toKustom( a.getMotor( vu.getMotor("user") ).getJenis() );
            p.setExcistData(a.getMotor( vu.getMotor("user") ) );
            
            p.getUpdate_btn().setVisible(true);
            p.getInput_btn().setVisible(false);
        }
        
        if(source.equals( vu.getDelete_btn() )){
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin menghapus " + vu.getMotor(person), "", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
                a.DeleteMotorKepemilikan( vu.getMotor(person), vu.getUser());
        }

        if(source.equals( vu.getDownload_btn() )){
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengambil " + vu.getMotor(person), "", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                Database d = new Database();
                d.connect();
                d.saveKepemilikan( l.getLogInUsername(), vu.getMotor("user"), 0 );
            }
        }
        
        if(source.equals( vu.getMotorUser_cb() )){
            vu.setPict(a.getMotor( vu.getMotor(person) ) );
            vu.setKomponenList( a.getMotorKomponen( a.getMotor( vu.getMotor(person) )) );
        }        
        
        //Admin
        if(source.equals( vu.getDeleteUser_btn() )){
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus user " + vu.getUser(), "", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){            
                a.DeleteUser( vu.getUser() );
                vu.setUserList( a.getUserList(), person );  
            }
        }
        
        if(source.equals( vu.getDeleteMotor_btn() )){
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus motor " + vu.getMotor("person"), "", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){              
                a.DeleteMotor( vu.getMotor("admin") );
                vu.setMotorAdminList( a.getMotorList(null) );            
            }
        }
        
        if(source.equals( vu.getMotorAdmin_cb() )){
            vu.setPict(a.getMotor( vu.getMotor(person) ) );
            vu.setKomponenList( a.getMotorKomponen( a.getMotor( vu.getMotor(person) )) );
        }        
        
        if(source.equals( vu.getUser_cb() )){
            if(person == "user"){
                if( l.getLogInUsername().equals( vu.getUser() ) ){
                    vu.getDelete_btn().setEnabled(true);
                    vu.getUpdate_btn().setEnabled(true);
                    vu.getDownload_btn().setEnabled(false);     
                    vu.reset_pages();
                    if( vu.getUser() == "<Lainnya>"){
                        vu.setMotorUserList( a.getMotorList(null) );
                    }else
                        vu.setMotorUserList( a.getMotorList(vu.getUser()) );                    
                }else{
                    vu.getDelete_btn().setEnabled(false);
                    vu.getUpdate_btn().setEnabled(false);
                    vu.getDownload_btn().setEnabled(true);
                }
            }
        }
        
        if(source.equals( vu.getExit_btn() )){
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar", "", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                vu.setVisible(false);
                l.setVisible(true);
                l.reset();
            }
        }
    }
}
