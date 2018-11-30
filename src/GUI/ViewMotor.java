package GUI;

import Class.*;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.util.ArrayList;

public class ViewMotor extends javax.swing.JFrame {
    
    public ViewMotor() {
        initComponents();
        setLocationRelativeTo(this);
        //reset_pages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kustom_pages = new javax.swing.JPanel();
        menubar_pages = new javax.swing.JPanel();
        Exit_btn = new javax.swing.JButton();
        Selesai_pages = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        user_cb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        MotorUser_cb = new javax.swing.JComboBox<>();
        MotorAdmin_cb = new javax.swing.JComboBox<>();
        Delete_btn = new javax.swing.JButton();
        Download_btn = new javax.swing.JButton();
        Update_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KomponenList_ta = new javax.swing.JTextArea();
        DeleteUser_btn = new javax.swing.JButton();
        DeleteMotor_btn = new javax.swing.JButton();
        Knalpot_pict = new javax.swing.JButton();
        Body_pict = new javax.swing.JButton();
        Roda_pict = new javax.swing.JButton();
        Velg_pict = new javax.swing.JButton();
        background3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(717, 473));
        setMinimumSize(new java.awt.Dimension(717, 473));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(717, 473));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        Kustom_pages.setLayout(null);

        menubar_pages.setOpaque(false);
        menubar_pages.setLayout(null);

        Exit_btn.setBackground(new java.awt.Color(0, 0, 0));
        Exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        Exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_quit.png"))); // NOI18N
        Exit_btn.setBorder(null);
        Exit_btn.setBorderPainted(false);
        Exit_btn.setContentAreaFilled(false);
        menubar_pages.add(Exit_btn);
        Exit_btn.setBounds(670, 0, 30, 30);

        Kustom_pages.add(menubar_pages);
        menubar_pages.setBounds(0, 430, 720, 40);

        Selesai_pages.setBackground(new java.awt.Color(51, 51, 51));
        Selesai_pages.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("User");
        Selesai_pages.add(jLabel4);
        jLabel4.setBounds(60, 30, 40, 20);

        user_cb.setBackground(new java.awt.Color(0, 0, 0));
        user_cb.setForeground(new java.awt.Color(255, 255, 255));
        user_cb.setMaximumRowCount(100);
        user_cb.setBorder(null);
        Selesai_pages.add(user_cb);
        user_cb.setBounds(110, 30, 140, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nama Motor");
        Selesai_pages.add(jLabel5);
        jLabel5.setBounds(0, 70, 100, 20);

        MotorUser_cb.setBackground(new java.awt.Color(0, 0, 0));
        MotorUser_cb.setForeground(new java.awt.Color(255, 255, 255));
        MotorUser_cb.setBorder(null);
        Selesai_pages.add(MotorUser_cb);
        MotorUser_cb.setBounds(110, 70, 140, 20);

        MotorAdmin_cb.setBackground(new java.awt.Color(0, 0, 0));
        MotorAdmin_cb.setForeground(new java.awt.Color(255, 255, 255));
        MotorAdmin_cb.setBorder(null);
        Selesai_pages.add(MotorAdmin_cb);
        MotorAdmin_cb.setBounds(110, 70, 140, 20);

        Delete_btn.setBackground(new java.awt.Color(0, 0, 0));
        Delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        Delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_Delete.png"))); // NOI18N
        Delete_btn.setBorder(null);
        Delete_btn.setBorderPainted(false);
        Delete_btn.setContentAreaFilled(false);
        Selesai_pages.add(Delete_btn);
        Delete_btn.setBounds(200, 140, 30, 30);

        Download_btn.setBackground(new java.awt.Color(0, 0, 0));
        Download_btn.setForeground(new java.awt.Color(255, 255, 255));
        Download_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_download.png"))); // NOI18N
        Download_btn.setBorder(null);
        Download_btn.setBorderPainted(false);
        Download_btn.setContentAreaFilled(false);
        Selesai_pages.add(Download_btn);
        Download_btn.setBounds(120, 140, 30, 30);

        Update_btn.setBackground(new java.awt.Color(0, 0, 0));
        Update_btn.setForeground(new java.awt.Color(255, 255, 255));
        Update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_edit.png"))); // NOI18N
        Update_btn.setBorder(null);
        Update_btn.setBorderPainted(false);
        Update_btn.setContentAreaFilled(false);
        Update_btn.setOpaque(false);
        Selesai_pages.add(Update_btn);
        Update_btn.setBounds(40, 140, 30, 30);

        KomponenList_ta.setEditable(false);
        KomponenList_ta.setBackground(new java.awt.Color(0, 0, 0));
        KomponenList_ta.setColumns(20);
        KomponenList_ta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        KomponenList_ta.setForeground(new java.awt.Color(255, 255, 255));
        KomponenList_ta.setRows(5);
        KomponenList_ta.setBorder(null);
        jScrollPane1.setViewportView(KomponenList_ta);

        Selesai_pages.add(jScrollPane1);
        jScrollPane1.setBounds(270, 20, 430, 170);

        DeleteUser_btn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteUser_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_Delete.png"))); // NOI18N
        DeleteUser_btn.setText("User");
        DeleteUser_btn.setBorder(null);
        DeleteUser_btn.setBorderPainted(false);
        DeleteUser_btn.setContentAreaFilled(false);
        Selesai_pages.add(DeleteUser_btn);
        DeleteUser_btn.setBounds(30, 140, 60, 30);

        DeleteMotor_btn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteMotor_btn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteMotor_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_Delete.png"))); // NOI18N
        DeleteMotor_btn.setText("Motor");
        DeleteMotor_btn.setBorder(null);
        DeleteMotor_btn.setBorderPainted(false);
        DeleteMotor_btn.setContentAreaFilled(false);
        Selesai_pages.add(DeleteMotor_btn);
        DeleteMotor_btn.setBounds(110, 140, 70, 30);

        Kustom_pages.add(Selesai_pages);
        Selesai_pages.setBounds(0, 0, 720, 210);

        Knalpot_pict.setBorder(null);
        Knalpot_pict.setBorderPainted(false);
        Knalpot_pict.setContentAreaFilled(false);
        Knalpot_pict.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Knalpot_pict.setDefaultCapable(false);
        Knalpot_pict.setFocusPainted(false);
        Knalpot_pict.setFocusable(false);
        Knalpot_pict.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Knalpot_pict.setMaximumSize(new java.awt.Dimension(720, 480));
        Knalpot_pict.setMinimumSize(new java.awt.Dimension(730, 480));
        Knalpot_pict.setPreferredSize(new java.awt.Dimension(720, 480));
        Knalpot_pict.setRequestFocusEnabled(false);
        Knalpot_pict.setRolloverEnabled(false);
        Knalpot_pict.setVerifyInputWhenFocusTarget(false);
        Kustom_pages.add(Knalpot_pict);
        Knalpot_pict.setBounds(0, 0, 730, 480);

        Body_pict.setBorder(null);
        Body_pict.setBorderPainted(false);
        Body_pict.setContentAreaFilled(false);
        Body_pict.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Body_pict.setDefaultCapable(false);
        Body_pict.setFocusPainted(false);
        Body_pict.setFocusable(false);
        Body_pict.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Body_pict.setMaximumSize(new java.awt.Dimension(720, 480));
        Body_pict.setMinimumSize(new java.awt.Dimension(730, 480));
        Body_pict.setPreferredSize(new java.awt.Dimension(720, 480));
        Body_pict.setRequestFocusEnabled(false);
        Body_pict.setRolloverEnabled(false);
        Body_pict.setVerifyInputWhenFocusTarget(false);
        Kustom_pages.add(Body_pict);
        Body_pict.setBounds(0, 0, 730, 480);

        Roda_pict.setBorder(null);
        Roda_pict.setBorderPainted(false);
        Roda_pict.setContentAreaFilled(false);
        Roda_pict.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Roda_pict.setDefaultCapable(false);
        Roda_pict.setFocusPainted(false);
        Roda_pict.setFocusable(false);
        Roda_pict.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Roda_pict.setMaximumSize(new java.awt.Dimension(730, 480));
        Roda_pict.setMinimumSize(new java.awt.Dimension(730, 480));
        Roda_pict.setPreferredSize(new java.awt.Dimension(720, 480));
        Roda_pict.setRequestFocusEnabled(false);
        Roda_pict.setRolloverEnabled(false);
        Roda_pict.setVerifyInputWhenFocusTarget(false);
        Kustom_pages.add(Roda_pict);
        Roda_pict.setBounds(0, 0, 730, 480);

        Velg_pict.setBorder(null);
        Velg_pict.setBorderPainted(false);
        Velg_pict.setContentAreaFilled(false);
        Velg_pict.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Velg_pict.setDefaultCapable(false);
        Velg_pict.setFocusPainted(false);
        Velg_pict.setFocusable(false);
        Velg_pict.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Velg_pict.setMaximumSize(new java.awt.Dimension(730, 480));
        Velg_pict.setMinimumSize(new java.awt.Dimension(730, 480));
        Velg_pict.setPreferredSize(new java.awt.Dimension(720, 480));
        Velg_pict.setRequestFocusEnabled(false);
        Velg_pict.setRolloverEnabled(false);
        Velg_pict.setVerifyInputWhenFocusTarget(false);
        Kustom_pages.add(Velg_pict);
        Velg_pict.setBounds(0, 0, 730, 480);

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Shadow.jpg"))); // NOI18N
        background3.setText("jButton1");
        background3.setBorder(null);
        background3.setBorderPainted(false);
        background3.setContentAreaFilled(false);
        background3.setDefaultCapable(false);
        background3.setFocusPainted(false);
        background3.setFocusable(false);
        background3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        background3.setPreferredSize(new java.awt.Dimension(720, 480));
        background3.setRolloverEnabled(false);
        background3.setSelected(true);
        Kustom_pages.add(background3);
        background3.setBounds(0, 200, 730, 280);

        getContentPane().add(Kustom_pages);
        Kustom_pages.setBounds(0, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Body_pict;
    private javax.swing.JButton DeleteMotor_btn;
    private javax.swing.JButton DeleteUser_btn;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton Download_btn;
    private javax.swing.JButton Exit_btn;
    private javax.swing.JButton Knalpot_pict;
    private javax.swing.JTextArea KomponenList_ta;
    private javax.swing.JPanel Kustom_pages;
    private javax.swing.JComboBox<String> MotorAdmin_cb;
    private javax.swing.JComboBox<String> MotorUser_cb;
    private javax.swing.JButton Roda_pict;
    private javax.swing.JPanel Selesai_pages;
    private javax.swing.JButton Update_btn;
    private javax.swing.JButton Velg_pict;
    private javax.swing.JButton background3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menubar_pages;
    private javax.swing.JComboBox<String> user_cb;
    // End of variables declaration//GEN-END:variables
    
    //Mengembalikan ke tampilan awal
    public void reset_pages(){
        MotorUser_cb.setVisible(true);
        KomponenList_ta.setText("");
    }
    
    public void set_pages(String input){
        if(input == "admin"){
            DeleteMotor_btn.setVisible(true);
            DeleteUser_btn.setVisible(true);
            Update_btn.setVisible(false);
            Download_btn.setVisible(false);
            MotorAdmin_cb.setVisible(true);
            MotorUser_cb.setVisible(false);
        }else if(input == "user"){
            DeleteMotor_btn.setVisible(false);
            DeleteUser_btn.setVisible(false);
            Update_btn.setVisible(true);
            Download_btn.setVisible(true);            
            MotorAdmin_cb.setVisible(false);
            MotorUser_cb.setVisible(true);            
        }
    }
    
    public int ColorBodytoInt(String color){
        switch(color){
            case "Putih":
                return 0;
            case "Hitam":
                return 1;
            case "Biru":
                return 2;                
            case "Hijau":
                return 3;
            case "Merah":
                return 4;
            default:
                return 5;
        }        
    }
    
    public int ColorTirestoInt(String color){
        switch(color){
            case "Putih":
                return 0;
            case "Hitam":
                return 1;
            case "Emas":
                return 2;
            case "Perak":
                return 3;
            case "Merah":
                return 4;
            default:
                return 5;
        }
    }    
    
    public void setMotorAdminList(ArrayList<String> a){
        MotorAdmin_cb.setModel( new DefaultComboBoxModel( a.toArray() ));
    }
    
    public void setMotorUserList(ArrayList<String> a){
        MotorUser_cb.setModel( new DefaultComboBoxModel( a.toArray()) );
    }
    
    public void setUserList (ArrayList<String> a){
        user_cb.setModel( new DefaultComboBoxModel( a.toArray() ));
    }
    
    public void setKomponenList(String s){
        KomponenList_ta.setText(s);
    }
    
    public String getUser(){
        return user_cb.getSelectedItem().toString();
    }
    
    public String getMotor(String person){
        if(person == "user")
            return MotorUser_cb.getSelectedItem().toString();
        else if(person == "admin")
            return MotorAdmin_cb.getSelectedItem().toString();
        else
            return null;
    }

    public void setPict(Motor m){
        Body_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Body "+ m.getBody().getBadan() +" ("+ ColorBodytoInt(m.getBody().getColor()) +").png" )));
        Velg_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Velg "+ m.getTires().getVelg() +" ("+ ColorTirestoInt(m.getTires().getColor()) +").png" )));
        Roda_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Ban "+ m.getTires().getType() +".png" )) );
        Knalpot_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("/image/motor/Knalpot "+ m.getEngine().getKnalpot() +".png")));
    }
    
    
    public JComboBox<String> getMotor_cb() {
        return MotorUser_cb;
    }

    public JComboBox<String> getUser_cb() {
        return user_cb;
    }
    
    public JButton getDelete_btn() {
        return Delete_btn;
    }

    public JButton getDeleteMotor_btn() {
        return DeleteMotor_btn;
    }
    
    public JButton getDeleteUser_btn() {
        return DeleteUser_btn;
    }

    public JButton getUpdate_btn() {
        return Update_btn;
    }

    public JButton getDownload_btn() {
        return Download_btn;
    }

    public JButton getExit_btn() {
        return Exit_btn;
    }
    
    public void addActionListener(ActionListener e){
        getDelete_btn().addActionListener(e);
        getUpdate_btn().addActionListener(e);
        getUser_cb().addActionListener(e);
        getMotor_cb().addActionListener(e);
        getDownload_btn().addActionListener(e);
        getDelete_btn().addActionListener(e);
        getDeleteMotor_btn().addActionListener(e);
        getDeleteUser_btn().addActionListener(e);
        Exit_btn.addActionListener(e);
    }
    
}