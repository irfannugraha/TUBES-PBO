package GUI;

import Class.*;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class ViewMotorUser extends javax.swing.JFrame {
    
    public ViewMotorUser() {
        initComponents();
        reset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kustom_pages = new javax.swing.JPanel();
        Selesai_pages = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        user_cb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Motor_cb = new javax.swing.JComboBox<>();
        Delete_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KomponenList_ta = new javax.swing.JTextArea();
        Show_btn1 = new javax.swing.JButton();
        Knalpot_pict = new javax.swing.JButton();
        Body_pict = new javax.swing.JButton();
        Roda_pict = new javax.swing.JButton();
        Velg_pict = new javax.swing.JButton();
        background3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(720, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 500));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        Kustom_pages.setLayout(null);

        Selesai_pages.setBackground(new java.awt.Color(51, 51, 51));
        Selesai_pages.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("User");
        Selesai_pages.add(jLabel4);
        jLabel4.setBounds(60, 20, 40, 20);

        user_cb.setBackground(new java.awt.Color(0, 0, 0));
        user_cb.setForeground(new java.awt.Color(255, 255, 255));
        user_cb.setBorder(null);
        Selesai_pages.add(user_cb);
        user_cb.setBounds(110, 20, 140, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nama Motor");
        Selesai_pages.add(jLabel5);
        jLabel5.setBounds(0, 60, 100, 20);

        Motor_cb.setBackground(new java.awt.Color(0, 0, 0));
        Motor_cb.setForeground(new java.awt.Color(255, 255, 255));
        Motor_cb.setBorder(null);
        Selesai_pages.add(Motor_cb);
        Motor_cb.setBounds(110, 60, 140, 20);

        Delete_btn.setBackground(new java.awt.Color(0, 0, 0));
        Delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        Delete_btn.setText("Perlihatkan");
        Delete_btn.setBorder(null);
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });
        Selesai_pages.add(Delete_btn);
        Delete_btn.setBounds(160, 100, 90, 30);

        KomponenList_ta.setEditable(false);
        KomponenList_ta.setBackground(new java.awt.Color(0, 0, 0));
        KomponenList_ta.setColumns(20);
        KomponenList_ta.setForeground(new java.awt.Color(255, 255, 255));
        KomponenList_ta.setRows(5);
        KomponenList_ta.setBorder(null);
        jScrollPane1.setViewportView(KomponenList_ta);

        Selesai_pages.add(jScrollPane1);
        jScrollPane1.setBounds(270, 20, 430, 170);

        Show_btn1.setBackground(new java.awt.Color(0, 0, 0));
        Show_btn1.setForeground(new java.awt.Color(255, 255, 255));
        Show_btn1.setText("Perlihatkan");
        Show_btn1.setBorder(null);
        Show_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_btn1ActionPerformed(evt);
            }
        });
        Selesai_pages.add(Show_btn1);
        Show_btn1.setBounds(20, 100, 90, 30);

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
        Body_pict.setBounds(0, 0, 720, 480);

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

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void Show_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_btn1ActionPerformed
        
    }//GEN-LAST:event_Show_btn1ActionPerformed

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Body_pict;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton Knalpot_pict;
    private javax.swing.JTextArea KomponenList_ta;
    private javax.swing.JPanel Kustom_pages;
    private javax.swing.JComboBox<String> Motor_cb;
    private javax.swing.JButton Roda_pict;
    private javax.swing.JPanel Selesai_pages;
    private javax.swing.JButton Show_btn1;
    private javax.swing.JButton Velg_pict;
    private javax.swing.JButton background3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> user_cb;
    // End of variables declaration//GEN-END:variables
    
    //Mengembalikan ke tampilan awal
    public void reset(){
        KomponenList_ta.setText("");
    }
    
    public void setKomponenList(String s){
        KomponenList_ta.setText(s);
    }
    
    public void setUserCb(String s){
        user_cb.addItem(s);
    }
    
    public void setMotorCb(String s){
        Motor_cb.addItem(s);
    }
    
    public String getUser(){
        return user_cb.getSelectedItem().toString();
    }
    
    public String getMotor(){
        return Motor_cb.getSelectedItem().toString();
    }
}