package tubes_KustomMotor;

public class PilihMotor extends javax.swing.JFrame {

    public PilihMotor() {
        initComponents();
        reset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_penyimpanan = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_sport = new javax.swing.JButton();
        btn_cub = new javax.swing.JButton();
        btn_matic = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nama_motor = new javax.swing.JTextField();
        cc_default = new javax.swing.JButton();
        cc_matic = new javax.swing.JComboBox();
        cc_cub = new javax.swing.JComboBox();
        cc_sport = new javax.swing.JComboBox();
        background = new javax.swing.JButton();
        matic = new javax.swing.JButton();
        cub = new javax.swing.JButton();
        sport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        btn_penyimpanan.setIcon(new javax.swing.ImageIcon("Z:\\Edit\\TUBES\\UI\\Penyimpanan.png")); // NOI18N
        btn_penyimpanan.setBorder(null);
        btn_penyimpanan.setBorderPainted(false);
        btn_penyimpanan.setContentAreaFilled(false);
        getContentPane().add(btn_penyimpanan);
        btn_penyimpanan.setBounds(20, 380, 100, 60);

        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/next.png"))); // NOI18N
        btn_next.setBorder(null);
        btn_next.setBorderPainted(false);
        btn_next.setContentAreaFilled(false);
        btn_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nextMouseClicked(evt);
            }
        });
        getContentPane().add(btn_next);
        btn_next.setBounds(610, 380, 80, 50);

        btn_sport.setBackground(new java.awt.Color(200, 137, 172));
        btn_sport.setBorder(null);
        btn_sport.setBorderPainted(false);
        btn_sport.setContentAreaFilled(false);
        btn_sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sportActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sport);
        btn_sport.setBounds(470, 0, 250, 290);

        btn_cub.setBackground(new java.awt.Color(200, 137, 172));
        btn_cub.setBorder(null);
        btn_cub.setBorderPainted(false);
        btn_cub.setContentAreaFilled(false);
        btn_cub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cubActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cub);
        btn_cub.setBounds(240, 0, 230, 290);

        btn_matic.setBackground(new java.awt.Color(200, 137, 172));
        btn_matic.setBorder(null);
        btn_matic.setBorderPainted(false);
        btn_matic.setContentAreaFilled(false);
        btn_matic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maticActionPerformed(evt);
            }
        });
        getContentPane().add(btn_matic);
        btn_matic.setBounds(0, 0, 240, 290);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 370, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Kapasitas mesin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 410, 108, 17);

        tf_nama_motor.setBackground(new java.awt.Color(0, 0, 0));
        tf_nama_motor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tf_nama_motor.setForeground(new java.awt.Color(255, 255, 255));
        tf_nama_motor.setAutoscrolls(false);
        tf_nama_motor.setBorder(null);
        getContentPane().add(tf_nama_motor);
        tf_nama_motor.setBounds(340, 370, 127, 20);

        cc_default.setBackground(new java.awt.Color(0, 0, 0));
        cc_default.setForeground(new java.awt.Color(255, 255, 255));
        cc_default.setText("Pilih motor dulu");
        cc_default.setBorder(null);
        getContentPane().add(cc_default);
        cc_default.setBounds(340, 410, 130, 20);

        cc_matic.setBackground(new java.awt.Color(0, 0, 0));
        cc_matic.setForeground(new java.awt.Color(255, 255, 255));
        cc_matic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "100", "125", "150", "200", "250", "600" }));
        cc_matic.setBorder(null);
        getContentPane().add(cc_matic);
        cc_matic.setBounds(340, 410, 127, 18);

        cc_cub.setBackground(new java.awt.Color(0, 0, 0));
        cc_cub.setForeground(new java.awt.Color(255, 255, 255));
        cc_cub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "50", "100", "110", "125", "150", "200" }));
        cc_cub.setBorder(null);
        getContentPane().add(cc_cub);
        cc_cub.setBounds(340, 410, 127, 18);

        cc_sport.setBackground(new java.awt.Color(0, 0, 0));
        cc_sport.setForeground(new java.awt.Color(255, 255, 255));
        cc_sport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "150", "200", "250", "600", "850", "1000" }));
        cc_sport.setBorder(null);
        getContentPane().add(cc_sport);
        cc_sport.setBounds(340, 410, 127, 18);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2.jpg"))); // NOI18N
        background.setText("jButton1");
        background.setBorder(null);
        background.setBorderPainted(false);
        background.setContentAreaFilled(false);
        background.setDefaultCapable(false);
        background.setFocusPainted(false);
        background.setFocusable(false);
        background.setMargin(new java.awt.Insets(0, 0, 0, 0));
        background.setPreferredSize(new java.awt.Dimension(720, 480));
        background.setRolloverEnabled(false);
        background.setSelected(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 730, 470);

        matic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/matic.jpg"))); // NOI18N
        matic.setText("jButton1");
        matic.setBorder(null);
        matic.setBorderPainted(false);
        matic.setContentAreaFilled(false);
        matic.setDefaultCapable(false);
        matic.setFocusPainted(false);
        matic.setFocusable(false);
        matic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        matic.setPreferredSize(new java.awt.Dimension(720, 480));
        matic.setRolloverEnabled(false);
        getContentPane().add(matic);
        matic.setBounds(0, 0, 730, 470);

        cub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cub.jpg"))); // NOI18N
        cub.setText("jButton1");
        cub.setBorder(null);
        cub.setBorderPainted(false);
        cub.setContentAreaFilled(false);
        cub.setDefaultCapable(false);
        cub.setFocusPainted(false);
        cub.setFocusable(false);
        cub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cub.setPreferredSize(new java.awt.Dimension(720, 480));
        cub.setRolloverEnabled(false);
        getContentPane().add(cub);
        cub.setBounds(0, 0, 730, 470);

        sport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sport.jpg"))); // NOI18N
        sport.setText("jButton1");
        sport.setBorder(null);
        sport.setBorderPainted(false);
        sport.setContentAreaFilled(false);
        sport.setDefaultCapable(false);
        sport.setFocusPainted(false);
        sport.setFocusable(false);
        sport.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sport.setPreferredSize(new java.awt.Dimension(720, 480));
        sport.setRolloverEnabled(false);
        getContentPane().add(sport);
        sport.setBounds(0, 0, 730, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cubActionPerformed
        matic.setVisible(false);
        cub.setVisible(true);
        sport.setVisible(false);
        background.setVisible(false);
        cc_matic.setVisible(false);
        cc_cub.setVisible(true);
        cc_sport.setVisible(false);   
        cc_default.setVisible(false);
    }//GEN-LAST:event_btn_cubActionPerformed

    private void btn_maticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maticActionPerformed
        matic.setVisible(true);
        cub.setVisible(false);
        sport.setVisible(false);
        background.setVisible(false);
        cc_matic.setVisible(true);
        cc_cub.setVisible(false);
        cc_sport.setVisible(false);          
        cc_default.setVisible(false);
    }//GEN-LAST:event_btn_maticActionPerformed

    private void btn_sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sportActionPerformed
        matic.setVisible(false);
        cub.setVisible(false);
        sport.setVisible(true);
        background.setVisible(false);
        cc_matic.setVisible(false);
        cc_cub.setVisible(false);
        cc_sport.setVisible(true); 
        cc_default.setVisible(false);
    }//GEN-LAST:event_btn_sportActionPerformed

    private void btn_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nextMouseClicked
        btn_next.setIcon( new javax.swing.ImageIcon(getClass().getResource("/image/next_false.png")) );
    }//GEN-LAST:event_btn_nextMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton background;
    private javax.swing.JButton btn_cub;
    private javax.swing.JButton btn_matic;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_penyimpanan;
    private javax.swing.JButton btn_sport;
    private javax.swing.JComboBox cc_cub;
    private javax.swing.JButton cc_default;
    private javax.swing.JComboBox cc_matic;
    private javax.swing.JComboBox cc_sport;
    private javax.swing.JButton cub;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton matic;
    private javax.swing.JButton sport;
    private javax.swing.JTextField tf_nama_motor;
    // End of variables declaration//GEN-END:variables

    public void reset(){
        background.setVisible(true);
        
        matic.setVisible(false);
        sport.setVisible(false);
        cub.setVisible(false);
        
        cc_default.setVisible(true);      
    }
}
