package GUI;

import Class.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    Application a = new Application();
    
    public Login() {
        initComponents();
        login_pages.setVisible(true);
        SignUp_pages.setVisible(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passBikin_tf = new javax.swing.JPasswordField();
        SignUp_pages = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UsernamBikin_tf = new javax.swing.JTextField();
        bikin_btn = new javax.swing.JButton();
        login_pages = new javax.swing.JPanel();
        Signup_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usernam_tf = new javax.swing.JTextField();
        pass_tf = new javax.swing.JPasswordField();
        Masukin_btn = new javax.swing.JButton();

        passBikin_tf.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(381, 300));
        setMinimumSize(new java.awt.Dimension(381, 300));
        getContentPane().setLayout(null);

        SignUp_pages.setLayout(null);

        jLabel3.setText("username");
        SignUp_pages.add(jLabel3);
        jLabel3.setBounds(10, 11, 47, 14);

        jLabel4.setText("pass");
        SignUp_pages.add(jLabel4);
        jLabel4.setBounds(10, 43, 22, 14);

        UsernamBikin_tf.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        SignUp_pages.add(UsernamBikin_tf);
        UsernamBikin_tf.setBounds(67, 11, 86, 20);

        bikin_btn.setText("Bikin");
        bikin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikin_btnActionPerformed(evt);
            }
        });
        SignUp_pages.add(bikin_btn);
        bikin_btn.setBounds(145, 87, 144, 159);

        getContentPane().add(SignUp_pages);
        SignUp_pages.setBounds(10, 11, 380, 270);

        login_pages.setLayout(null);

        Signup_btn.setText("SignUp");
        Signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_btnActionPerformed(evt);
            }
        });
        login_pages.add(Signup_btn);
        Signup_btn.setBounds(20, 155, 65, 23);

        jLabel1.setText("username");
        login_pages.add(jLabel1);
        jLabel1.setBounds(10, 11, 47, 14);

        jLabel2.setText("pass");
        login_pages.add(jLabel2);
        jLabel2.setBounds(10, 43, 22, 14);

        Usernam_tf.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        login_pages.add(Usernam_tf);
        Usernam_tf.setBounds(67, 11, 86, 20);

        pass_tf.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        login_pages.add(pass_tf);
        pass_tf.setBounds(67, 49, 300, 20);

        Masukin_btn.setText("Masukin");
        login_pages.add(Masukin_btn);
        Masukin_btn.setBounds(145, 87, 144, 159);

        getContentPane().add(login_pages);
        login_pages.setBounds(10, 11, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_btnActionPerformed
        login_pages.setVisible(false);
        SignUp_pages.setVisible(true);
    }//GEN-LAST:event_Signup_btnActionPerformed

    private void bikin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikin_btnActionPerformed
        JOptionPane.showMessageDialog(null, getUsername());
        a.CreateUser(getUsername(), getPass());
    }//GEN-LAST:event_bikin_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Masukin_btn;
    private javax.swing.JPanel SignUp_pages;
    private javax.swing.JButton Signup_btn;
    private javax.swing.JTextField UsernamBikin_tf;
    private javax.swing.JTextField Usernam_tf;
    private javax.swing.JButton bikin_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel login_pages;
    private javax.swing.JPasswordField passBikin_tf;
    private javax.swing.JPasswordField pass_tf;
    // End of variables declaration//GEN-END:variables

    public String getUsername() {
        return UsernamBikin_tf.getText();
    }

    public String getPass() {
        return passBikin_tf.getText();
    }    
}