package View;

import javax.swing.*;
import java.awt.event.*;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
        reset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogIn_pages = new javax.swing.JPanel();
        Exit_btn = new javax.swing.JButton();
        Logo2 = new javax.swing.JToggleButton();
        Logo3 = new javax.swing.JToggleButton();
        UsernameLogin_tf = new javax.swing.JTextField();
        PasswordLogin_tf = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        GoSignUp_btn = new javax.swing.JButton();
        LogIn_btn = new javax.swing.JButton();
        background = new javax.swing.JToggleButton();
        SignUp_pages = new javax.swing.JPanel();
        Logo1 = new javax.swing.JToggleButton();
        Logo = new javax.swing.JToggleButton();
        UsernameSignUp_tf = new javax.swing.JTextField();
        PasswordSignUp_tf = new javax.swing.JPasswordField();
        Kembali_btn = new javax.swing.JButton();
        SignUp_btn = new javax.swing.JButton();
        background1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(470, 480));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(470, 480));
        getContentPane().setLayout(null);

        LogIn_pages.setMaximumSize(new java.awt.Dimension(480, 480));
        LogIn_pages.setMinimumSize(new java.awt.Dimension(480, 480));
        LogIn_pages.setPreferredSize(new java.awt.Dimension(480, 480));
        LogIn_pages.setLayout(null);

        Exit_btn.setBackground(new java.awt.Color(0, 0, 0));
        Exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        Exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_quit.png"))); // NOI18N
        Exit_btn.setBorder(null);
        Exit_btn.setBorderPainted(false);
        Exit_btn.setContentAreaFilled(false);
        Exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_btnActionPerformed(evt);
            }
        });
        LogIn_pages.add(Exit_btn);
        Exit_btn.setBounds(420, 430, 30, 30);

        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_password.png"))); // NOI18N
        Logo2.setBorder(null);
        Logo2.setBorderPainted(false);
        Logo2.setContentAreaFilled(false);
        Logo2.setFocusPainted(false);
        Logo2.setFocusable(false);
        Logo2.setRolloverEnabled(false);
        LogIn_pages.add(Logo2);
        Logo2.setBounds(30, 300, 30, 30);

        Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_user.png"))); // NOI18N
        Logo3.setBorder(null);
        Logo3.setBorderPainted(false);
        Logo3.setContentAreaFilled(false);
        Logo3.setFocusPainted(false);
        Logo3.setFocusable(false);
        Logo3.setRolloverEnabled(false);
        LogIn_pages.add(Logo3);
        Logo3.setBounds(30, 250, 30, 30);

        UsernameLogin_tf.setBackground(new java.awt.Color(0, 0, 0));
        UsernameLogin_tf.setForeground(new java.awt.Color(204, 204, 204));
        UsernameLogin_tf.setAutoscrolls(false);
        UsernameLogin_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        LogIn_pages.add(UsernameLogin_tf);
        UsernameLogin_tf.setBounds(80, 260, 140, 20);

        PasswordLogin_tf.setBackground(new java.awt.Color(0, 0, 0));
        PasswordLogin_tf.setForeground(new java.awt.Color(204, 204, 204));
        PasswordLogin_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LogIn_pages.add(PasswordLogin_tf);
        PasswordLogin_tf.setBounds(80, 310, 140, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Belum memiliki account? silahkan buat disini");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn_pages.add(jLabel5);
        jLabel5.setBounds(0, 420, 240, 20);

        GoSignUp_btn.setBackground(new java.awt.Color(0, 0, 0));
        GoSignUp_btn.setForeground(new java.awt.Color(204, 204, 204));
        GoSignUp_btn.setToolTipText("");
        GoSignUp_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        GoSignUp_btn.setBorderPainted(false);
        GoSignUp_btn.setContentAreaFilled(false);
        GoSignUp_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoSignUp_btnActionPerformed(evt);
            }
        });
        LogIn_pages.add(GoSignUp_btn);
        GoSignUp_btn.setBounds(30, 420, 210, 20);

        LogIn_btn.setBackground(new java.awt.Color(0, 0, 0));
        LogIn_btn.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_btn.setText("Log In");
        LogIn_btn.setToolTipText("");
        LogIn_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LogIn_btn.setBorderPainted(false);
        LogIn_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn_pages.add(LogIn_btn);
        LogIn_btn.setBounds(160, 360, 60, 20);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LogIn pages.jpg"))); // NOI18N
        background.setText("jToggleButton1");
        background.setBorder(null);
        background.setBorderPainted(false);
        background.setContentAreaFilled(false);
        background.setFocusPainted(false);
        background.setFocusable(false);
        background.setRolloverEnabled(false);
        LogIn_pages.add(background);
        background.setBounds(0, 0, 480, 480);

        getContentPane().add(LogIn_pages);
        LogIn_pages.setBounds(0, 0, 480, 480);

        SignUp_pages.setMaximumSize(new java.awt.Dimension(480, 480));
        SignUp_pages.setMinimumSize(new java.awt.Dimension(480, 480));
        SignUp_pages.setLayout(null);

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_password.png"))); // NOI18N
        Logo1.setBorder(null);
        Logo1.setBorderPainted(false);
        Logo1.setContentAreaFilled(false);
        Logo1.setFocusPainted(false);
        Logo1.setFocusable(false);
        Logo1.setRolloverEnabled(false);
        SignUp_pages.add(Logo1);
        Logo1.setBounds(250, 170, 30, 30);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_user.png"))); // NOI18N
        Logo.setBorder(null);
        Logo.setBorderPainted(false);
        Logo.setContentAreaFilled(false);
        Logo.setFocusPainted(false);
        Logo.setFocusable(false);
        Logo.setRolloverEnabled(false);
        SignUp_pages.add(Logo);
        Logo.setBounds(250, 120, 30, 30);

        UsernameSignUp_tf.setBackground(new java.awt.Color(0, 0, 0));
        UsernameSignUp_tf.setForeground(new java.awt.Color(204, 204, 204));
        UsernameSignUp_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        SignUp_pages.add(UsernameSignUp_tf);
        UsernameSignUp_tf.setBounds(300, 130, 140, 20);

        PasswordSignUp_tf.setBackground(new java.awt.Color(0, 0, 0));
        PasswordSignUp_tf.setForeground(new java.awt.Color(204, 204, 204));
        SignUp_pages.add(PasswordSignUp_tf);
        PasswordSignUp_tf.setBounds(300, 180, 140, 20);

        Kembali_btn.setBackground(new java.awt.Color(204, 204, 204));
        Kembali_btn.setForeground(new java.awt.Color(255, 255, 255));
        Kembali_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_back.png"))); // NOI18N
        Kembali_btn.setText("Kembali");
        Kembali_btn.setToolTipText("");
        Kembali_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Kembali_btn.setBorderPainted(false);
        Kembali_btn.setContentAreaFilled(false);
        Kembali_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kembali_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kembali_btnActionPerformed(evt);
            }
        });
        SignUp_pages.add(Kembali_btn);
        Kembali_btn.setBounds(370, 420, 80, 40);

        SignUp_btn.setBackground(new java.awt.Color(0, 0, 0));
        SignUp_btn.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_btn.setText("Bergabung");
        SignUp_btn.setToolTipText("");
        SignUp_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SignUp_btn.setBorderPainted(false);
        SignUp_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp_pages.add(SignUp_btn);
        SignUp_btn.setBounds(370, 230, 70, 20);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SignUp pages.jpg"))); // NOI18N
        background1.setText("jToggleButton1");
        background1.setBorder(null);
        background1.setBorderPainted(false);
        background1.setContentAreaFilled(false);
        background1.setFocusPainted(false);
        background1.setFocusable(false);
        background1.setRolloverEnabled(false);
        SignUp_pages.add(background1);
        background1.setBounds(0, 0, 550, 480);

        getContentPane().add(SignUp_pages);
        SignUp_pages.setBounds(0, 0, 480, 480);

        setBounds(0, 0, 470, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void GoSignUp_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoSignUp_btnActionPerformed
        LogIn_pages.setVisible(false);
        SignUp_pages.setVisible(true);
    }//GEN-LAST:event_GoSignUp_btnActionPerformed

    private void Kembali_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kembali_btnActionPerformed
        reset();
    }//GEN-LAST:event_Kembali_btnActionPerformed

    private void Exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_btnActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar", "", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_Exit_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_btn;
    private javax.swing.JButton GoSignUp_btn;
    private javax.swing.JButton Kembali_btn;
    private javax.swing.JButton LogIn_btn;
    private javax.swing.JPanel LogIn_pages;
    private javax.swing.JToggleButton Logo;
    private javax.swing.JToggleButton Logo1;
    private javax.swing.JToggleButton Logo2;
    private javax.swing.JToggleButton Logo3;
    private javax.swing.JPasswordField PasswordLogin_tf;
    private javax.swing.JPasswordField PasswordSignUp_tf;
    private javax.swing.JButton SignUp_btn;
    private javax.swing.JPanel SignUp_pages;
    private javax.swing.JTextField UsernameLogin_tf;
    private javax.swing.JTextField UsernameSignUp_tf;
    private javax.swing.JToggleButton background;
    private javax.swing.JToggleButton background1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    //mengatur ulang GUI LOGIN
    public void reset(){
        LogIn_pages.setVisible(true);
        SignUp_pages.setVisible(false);        
        UsernameLogin_tf.setText(null);
        PasswordLogin_tf.setText(null);
        UsernameSignUp_tf.setText(null);
        PasswordSignUp_tf.setText(null);
    }
    //mendapatkan isi USERNAME yang dimasukan user ketika LOGIN
    public String getLogInUsername() {
        return UsernameLogin_tf.getText();
    }
    //mendapatkan isi PASSWORD yang dimasukan user ketika LOGIN
    public String getLogInPassword() {
        return PasswordLogin_tf.getText();
    }
    //mendapatkan isi USERNAME yang dimasukan user ketika MEMBUAT USER baru
    public String getSignUpUsername() {
        return UsernameSignUp_tf.getText();
    }
    //mendapatkan isi PASSWORD yang dimasukan user ketika MEMBUAT USER baru
    public String getSignUpPassword() {
        return PasswordSignUp_tf.getText();
    }
    
//mengembalikan tekanan tombol dari pengguna    
    public JButton getLogIn_btn() {
        return LogIn_btn;
    }

    public JButton getSignUp_btn() {
        return SignUp_btn;
    }
    
    public void addActionListener(ActionListener e){
        getLogIn_btn().addActionListener(e);
        getSignUp_btn().addActionListener(e);
    }
}