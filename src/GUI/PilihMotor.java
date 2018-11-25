package GUI;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class PilihMotor extends javax.swing.JFrame {

    private char tipemotor = 'm';
    private String selectedbadan;
    
    public PilihMotor() {
        initComponents();
        reset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kustom_pages = new javax.swing.JPanel();
        btn_badan = new javax.swing.JButton();
        btn_roda = new javax.swing.JButton();
        btn_mesin = new javax.swing.JButton();
        btn_selesai = new javax.swing.JButton();
        Mesin_pages = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Knalpot_cb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Cylinder_cb = new javax.swing.JComboBox();
        background2 = new javax.swing.JButton();
        Roda_pages = new javax.swing.JPanel();
        Velg_cb = new javax.swing.JComboBox();
        Warna_roda_cb = new javax.swing.JComboBox();
        Ban_cb = new javax.swing.JComboBox<>();
        Diameter_tf = new javax.swing.JTextField();
        Lebar_tf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Roda_back = new javax.swing.JButton();
        Badan_pages = new javax.swing.JPanel();
        Seat_cb = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Headlamp_cb = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Warna_Badan_cb = new javax.swing.JComboBox();
        Tangki_tf = new javax.swing.JTextField();
        Badan_matic_cb = new javax.swing.JComboBox();
        Badan_cub_cb = new javax.swing.JComboBox();
        Badan_sport_cb = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Badan_back = new javax.swing.JButton();
        Knalpot_pict = new javax.swing.JButton();
        Body_pict = new javax.swing.JButton();
        Roda_pict = new javax.swing.JButton();
        Velg_pict = new javax.swing.JButton();
        background3 = new javax.swing.JButton();
        PilihMotor_pages = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(720, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 500));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        Kustom_pages.setLayout(null);

        btn_badan.setBackground(new java.awt.Color(200, 137, 172));
        btn_badan.setBorder(null);
        btn_badan.setBorderPainted(false);
        btn_badan.setContentAreaFilled(false);
        btn_badan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_badanActionPerformed(evt);
            }
        });
        Kustom_pages.add(btn_badan);
        btn_badan.setBounds(190, 0, 170, 40);

        btn_roda.setBackground(new java.awt.Color(200, 137, 172));
        btn_roda.setBorder(null);
        btn_roda.setBorderPainted(false);
        btn_roda.setContentAreaFilled(false);
        btn_roda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rodaActionPerformed(evt);
            }
        });
        Kustom_pages.add(btn_roda);
        btn_roda.setBounds(360, 0, 170, 40);

        btn_mesin.setBackground(new java.awt.Color(200, 137, 172));
        btn_mesin.setBorder(null);
        btn_mesin.setBorderPainted(false);
        btn_mesin.setContentAreaFilled(false);
        btn_mesin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mesinActionPerformed(evt);
            }
        });
        Kustom_pages.add(btn_mesin);
        btn_mesin.setBounds(10, 0, 170, 40);

        btn_selesai.setBackground(new java.awt.Color(200, 137, 172));
        btn_selesai.setBorder(null);
        btn_selesai.setBorderPainted(false);
        btn_selesai.setContentAreaFilled(false);
        Kustom_pages.add(btn_selesai);
        btn_selesai.setBounds(530, 0, 180, 40);

        Mesin_pages.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Kenalpot");
        Mesin_pages.add(jLabel4);
        jLabel4.setBounds(30, 70, 100, 17);

        Knalpot_cb.setBackground(new java.awt.Color(0, 0, 0));
        Knalpot_cb.setForeground(new java.awt.Color(255, 255, 255));
        Knalpot_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Kosong>", "Standart", "Yoshimura", "Tridente" }));
        Knalpot_cb.setBorder(null);
        Knalpot_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Knalpot_cbActionPerformed(evt);
            }
        });
        Mesin_pages.add(Knalpot_cb);
        Knalpot_cb.setBounds(150, 70, 127, 18);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cylinder");
        Mesin_pages.add(jLabel5);
        jLabel5.setBounds(20, 110, 108, 17);

        Cylinder_cb.setBackground(new java.awt.Color(0, 0, 0));
        Cylinder_cb.setForeground(new java.awt.Color(255, 255, 255));
        Cylinder_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "4", "6", "8" }));
        Cylinder_cb.setBorder(null);
        Mesin_pages.add(Cylinder_cb);
        Cylinder_cb.setBounds(150, 110, 127, 18);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Mesin_page.jpg"))); // NOI18N
        background2.setText("jButton1");
        background2.setBorder(null);
        background2.setBorderPainted(false);
        background2.setContentAreaFilled(false);
        background2.setDefaultCapable(false);
        background2.setFocusPainted(false);
        background2.setFocusable(false);
        background2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        background2.setPreferredSize(new java.awt.Dimension(720, 480));
        background2.setRolloverEnabled(false);
        background2.setSelected(true);
        Mesin_pages.add(background2);
        background2.setBounds(0, 0, 730, 210);

        Kustom_pages.add(Mesin_pages);
        Mesin_pages.setBounds(0, 0, 720, 210);

        Roda_pages.setLayout(null);

        Velg_cb.setBackground(new java.awt.Color(0, 0, 0));
        Velg_cb.setForeground(new java.awt.Color(255, 255, 255));
        Velg_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Kosong>", "Jari Jari", "Standart", "Cast Wheel" }));
        Velg_cb.setBorder(null);
        Velg_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Velg_cbActionPerformed(evt);
            }
        });
        Roda_pages.add(Velg_cb);
        Velg_cb.setBounds(150, 70, 127, 18);

        Warna_roda_cb.setBackground(new java.awt.Color(0, 0, 0));
        Warna_roda_cb.setForeground(new java.awt.Color(255, 255, 255));
        Warna_roda_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Putih", "Hitam", "Biru", "Hijau", "Merah" }));
        Warna_roda_cb.setBorder(null);
        Warna_roda_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Warna_roda_cbActionPerformed(evt);
            }
        });
        Roda_pages.add(Warna_roda_cb);
        Warna_roda_cb.setBounds(150, 150, 127, 18);

        Ban_cb.setBackground(new java.awt.Color(0, 0, 0));
        Ban_cb.setForeground(new java.awt.Color(255, 255, 255));
        Ban_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Kosong>", "Kota", "Off Road", "Race" }));
        Ban_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ban_cbActionPerformed(evt);
            }
        });
        Roda_pages.add(Ban_cb);
        Ban_cb.setBounds(150, 110, 130, 20);
        Roda_pages.add(Diameter_tf);
        Diameter_tf.setBounds(500, 70, 90, 20);
        Roda_pages.add(Lebar_tf);
        Lebar_tf.setBounds(500, 110, 90, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Velg");
        Roda_pages.add(jLabel16);
        jLabel16.setBounds(30, 70, 100, 17);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Tipe Ban");
        Roda_pages.add(jLabel18);
        jLabel18.setBounds(20, 110, 108, 17);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Cm");
        Roda_pages.add(jLabel19);
        jLabel19.setBounds(530, 110, 100, 17);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Lebar");
        Roda_pages.add(jLabel20);
        jLabel20.setBounds(370, 110, 108, 17);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Warna");
        Roda_pages.add(jLabel21);
        jLabel21.setBounds(20, 150, 108, 17);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Diameter");
        Roda_pages.add(jLabel22);
        jLabel22.setBounds(380, 70, 100, 17);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Cm");
        Roda_pages.add(jLabel23);
        jLabel23.setBounds(530, 70, 100, 17);

        Roda_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Roda_page_1.jpg"))); // NOI18N
        Roda_back.setText("jButton1");
        Roda_back.setBorder(null);
        Roda_back.setBorderPainted(false);
        Roda_back.setContentAreaFilled(false);
        Roda_back.setDefaultCapable(false);
        Roda_back.setFocusPainted(false);
        Roda_back.setFocusable(false);
        Roda_back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Roda_back.setPreferredSize(new java.awt.Dimension(720, 480));
        Roda_back.setRolloverEnabled(false);
        Roda_back.setSelected(true);
        Roda_pages.add(Roda_back);
        Roda_back.setBounds(0, 0, 730, 210);

        Kustom_pages.add(Roda_pages);
        Roda_pages.setBounds(0, 0, 720, 210);

        Badan_pages.setLayout(null);

        Seat_cb.setBackground(new java.awt.Color(0, 0, 0));
        Seat_cb.setForeground(new java.awt.Color(255, 255, 255));
        Seat_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standart", "Single seat" }));
        Seat_cb.setBorder(null);
        Badan_pages.add(Seat_cb);
        Seat_cb.setBounds(500, 70, 127, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Badan");
        Badan_pages.add(jLabel10);
        jLabel10.setBounds(30, 70, 100, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Headlamp");
        Badan_pages.add(jLabel14);
        jLabel14.setBounds(370, 110, 108, 20);

        Headlamp_cb.setBackground(new java.awt.Color(0, 0, 0));
        Headlamp_cb.setForeground(new java.awt.Color(255, 255, 255));
        Headlamp_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LED", "Bohlam", "Strobo", "Flare" }));
        Headlamp_cb.setBorder(null);
        Badan_pages.add(Headlamp_cb);
        Headlamp_cb.setBounds(500, 110, 127, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Tanki");
        Badan_pages.add(jLabel11);
        jLabel11.setBounds(20, 110, 108, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Seat");
        Badan_pages.add(jLabel13);
        jLabel13.setBounds(380, 70, 100, 20);

        Warna_Badan_cb.setBackground(new java.awt.Color(0, 0, 0));
        Warna_Badan_cb.setForeground(new java.awt.Color(255, 255, 255));
        Warna_Badan_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Putih", "Hitam", "Biru", "Hijau", "Merah" }));
        Warna_Badan_cb.setBorder(null);
        Warna_Badan_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Warna_Badan_cbActionPerformed(evt);
            }
        });
        Badan_pages.add(Warna_Badan_cb);
        Warna_Badan_cb.setBounds(150, 150, 127, 20);
        Badan_pages.add(Tangki_tf);
        Tangki_tf.setBounds(150, 110, 90, 20);

        Badan_matic_cb.setBackground(new java.awt.Color(0, 0, 0));
        Badan_matic_cb.setForeground(new java.awt.Color(255, 255, 255));
        Badan_matic_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Kosong>", "Vario", "NM4 Vultus", "TMAX" }));
        Badan_matic_cb.setBorder(null);
        Badan_matic_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Badan_matic_cbActionPerformed(evt);
            }
        });
        Badan_pages.add(Badan_matic_cb);
        Badan_matic_cb.setBounds(150, 70, 127, 20);

        Badan_cub_cb.setBackground(new java.awt.Color(0, 0, 0));
        Badan_cub_cb.setForeground(new java.awt.Color(255, 255, 255));
        Badan_cub_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Kosong>", "Super Cub", "Supra GTR", "Smash Titan" }));
        Badan_cub_cb.setBorder(null);
        Badan_cub_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Badan_cub_cbActionPerformed(evt);
            }
        });
        Badan_pages.add(Badan_cub_cb);
        Badan_cub_cb.setBounds(150, 70, 127, 20);

        Badan_sport_cb.setBackground(new java.awt.Color(0, 0, 0));
        Badan_sport_cb.setForeground(new java.awt.Color(255, 255, 255));
        Badan_sport_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Kosong>", "anu", "anu", "anu" }));
        Badan_sport_cb.setBorder(null);
        Badan_sport_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Badan_sport_cbActionPerformed(evt);
            }
        });
        Badan_pages.add(Badan_sport_cb);
        Badan_sport_cb.setBounds(150, 70, 127, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Liter");
        jLabel15.setToolTipText("");
        Badan_pages.add(jLabel15);
        jLabel15.setBounds(240, 110, 40, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Warna");
        Badan_pages.add(jLabel12);
        jLabel12.setBounds(20, 150, 108, 20);

        Badan_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/badan_page_1.jpg"))); // NOI18N
        Badan_back.setText("jButton1");
        Badan_back.setBorder(null);
        Badan_back.setBorderPainted(false);
        Badan_back.setContentAreaFilled(false);
        Badan_back.setDefaultCapable(false);
        Badan_back.setFocusPainted(false);
        Badan_back.setFocusable(false);
        Badan_back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Badan_back.setPreferredSize(new java.awt.Dimension(720, 480));
        Badan_back.setRolloverEnabled(false);
        Badan_back.setSelected(true);
        Badan_pages.add(Badan_back);
        Badan_back.setBounds(0, 0, 730, 210);

        Kustom_pages.add(Badan_pages);
        Badan_pages.setBounds(0, 0, 720, 210);

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

        PilihMotor_pages.setLayout(null);

        btn_penyimpanan.setIcon(new javax.swing.ImageIcon("Z:\\Edit\\TUBES\\UI\\Penyimpanan.png")); // NOI18N
        btn_penyimpanan.setBorder(null);
        btn_penyimpanan.setBorderPainted(false);
        btn_penyimpanan.setContentAreaFilled(false);
        PilihMotor_pages.add(btn_penyimpanan);
        btn_penyimpanan.setBounds(20, 380, 100, 60);

        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/next.png"))); // NOI18N
        btn_next.setBorder(null);
        btn_next.setBorderPainted(false);
        btn_next.setContentAreaFilled(false);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        PilihMotor_pages.add(btn_next);
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
        PilihMotor_pages.add(btn_sport);
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
        PilihMotor_pages.add(btn_cub);
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
        PilihMotor_pages.add(btn_matic);
        btn_matic.setBounds(0, 0, 240, 290);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");
        PilihMotor_pages.add(jLabel2);
        jLabel2.setBounds(220, 370, 100, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Kapasitas mesin");
        PilihMotor_pages.add(jLabel3);
        jLabel3.setBounds(210, 410, 108, 17);

        tf_nama_motor.setBackground(new java.awt.Color(0, 0, 0));
        tf_nama_motor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tf_nama_motor.setForeground(new java.awt.Color(255, 255, 255));
        tf_nama_motor.setAutoscrolls(false);
        tf_nama_motor.setBorder(null);
        PilihMotor_pages.add(tf_nama_motor);
        tf_nama_motor.setBounds(340, 370, 127, 20);

        cc_default.setBackground(new java.awt.Color(0, 0, 0));
        cc_default.setForeground(new java.awt.Color(255, 255, 255));
        cc_default.setText("Pilih motor dulu");
        cc_default.setBorder(null);
        PilihMotor_pages.add(cc_default);
        cc_default.setBounds(340, 410, 130, 20);

        cc_matic.setBackground(new java.awt.Color(0, 0, 0));
        cc_matic.setForeground(new java.awt.Color(255, 255, 255));
        cc_matic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "100", "125", "150", "200", "250", "600" }));
        cc_matic.setBorder(null);
        PilihMotor_pages.add(cc_matic);
        cc_matic.setBounds(340, 410, 127, 18);

        cc_cub.setBackground(new java.awt.Color(0, 0, 0));
        cc_cub.setForeground(new java.awt.Color(255, 255, 255));
        cc_cub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "50", "100", "110", "125", "150", "200" }));
        cc_cub.setBorder(null);
        PilihMotor_pages.add(cc_cub);
        cc_cub.setBounds(340, 410, 127, 18);

        cc_sport.setBackground(new java.awt.Color(0, 0, 0));
        cc_sport.setForeground(new java.awt.Color(255, 255, 255));
        cc_sport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "150", "200", "250", "600", "850", "1000" }));
        cc_sport.setBorder(null);
        PilihMotor_pages.add(cc_sport);
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
        PilihMotor_pages.add(background);
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
        PilihMotor_pages.add(matic);
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
        PilihMotor_pages.add(cub);
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
        PilihMotor_pages.add(sport);
        sport.setBounds(0, 0, 730, 470);

        getContentPane().add(PilihMotor_pages);
        PilihMotor_pages.setBounds(0, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_maticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maticActionPerformed
        matic.setVisible(true);
        cub.setVisible(false);
        sport.setVisible(false);
        background.setVisible(false);
        
        cc_matic.setVisible(true);
        cc_cub.setVisible(false);
        cc_sport.setVisible(false);
        cc_default.setVisible(false);
        
        tipemotor = 'm';
    }//GEN-LAST:event_btn_maticActionPerformed

    private void btn_cubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cubActionPerformed
        matic.setVisible(false);
        cub.setVisible(true);
        sport.setVisible(false);
        background.setVisible(false);
        
        cc_matic.setVisible(false);
        cc_cub.setVisible(true);
        cc_sport.setVisible(false);
        cc_default.setVisible(false);
        
        tipemotor = 'c';
    }//GEN-LAST:event_btn_cubActionPerformed

    private void btn_sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sportActionPerformed
        matic.setVisible(false);
        cub.setVisible(false);
        sport.setVisible(true);
        background.setVisible(false);
        
        cc_matic.setVisible(false);
        cc_cub.setVisible(false);
        cc_sport.setVisible(true);
        cc_default.setVisible(false);
        
        tipemotor = 's';
    }//GEN-LAST:event_btn_sportActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if(cc_default.isVisible()){
            JOptionPane.showMessageDialog(null, "Anda Belum Memilih Motor");
        }
        else{
            PilihMotor_pages.setVisible(false);
            Kustom_pages.setVisible(true);
            if(tipemotor == 'm'){
                Badan_matic_cb.setVisible(true);
                Badan_cub_cb.setVisible(false);
                Badan_sport_cb.setVisible(false);            
            }
            if(tipemotor == 'c'){
                Badan_matic_cb.setVisible(false);
                Badan_cub_cb.setVisible(true);
                Badan_sport_cb.setVisible(false);
            }
            if(tipemotor == 's'){
                Badan_matic_cb.setVisible(false);
                Badan_cub_cb.setVisible(false);
                Badan_sport_cb.setVisible(true);                
            }
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    
    private void Knalpot_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Knalpot_cbActionPerformed
        if(Knalpot_cb.getSelectedIndex() == 0){
            Knalpot_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else
        Knalpot_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("/image/motor/Knalpot "+ Knalpot_cb.getSelectedItem() +".png")));
    }//GEN-LAST:event_Knalpot_cbActionPerformed

    
    private void btn_badanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_badanActionPerformed
        Mesin_pages.setVisible(false);
        Badan_pages.setVisible(true);
        Roda_pages.setVisible(false);
    }//GEN-LAST:event_btn_badanActionPerformed

    private void btn_rodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rodaActionPerformed
        Mesin_pages.setVisible(false);
        Badan_pages.setVisible(false);
        Roda_pages.setVisible(true);
    }//GEN-LAST:event_btn_rodaActionPerformed

    private void btn_mesinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mesinActionPerformed
        Mesin_pages.setVisible(true);
        Badan_pages.setVisible(false);
        Roda_pages.setVisible(false);
    }//GEN-LAST:event_btn_mesinActionPerformed

    
    private void Badan_matic_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Badan_matic_cbActionPerformed
        if(Badan_matic_cb.getSelectedIndex() == 0){
            Body_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else        
            Body_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Body "+ Badan_matic_cb.getSelectedItem() +" ("+ Warna_Badan_cb.getSelectedIndex() +").png" )));
        
        selectedbadan = Badan_matic_cb.getSelectedItem().toString();
    }//GEN-LAST:event_Badan_matic_cbActionPerformed

    private void Badan_cub_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Badan_cub_cbActionPerformed
        if(Badan_cub_cb.getSelectedIndex() == 0){
            Body_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else        
        Body_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Body "+ Badan_cub_cb.getSelectedItem() +" ("+ Warna_Badan_cb.getSelectedIndex() +").png" )));
        
        selectedbadan = Badan_cub_cb.getSelectedItem().toString();
    }//GEN-LAST:event_Badan_cub_cbActionPerformed

    private void Velg_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Velg_cbActionPerformed
        if(Velg_cb.getSelectedIndex() == 0){
            Velg_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else
        Velg_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Velg "+ Velg_cb.getSelectedItem() +" ("+ Warna_roda_cb.getSelectedIndex() +").png" )) );
    }//GEN-LAST:event_Velg_cbActionPerformed

    private void Ban_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ban_cbActionPerformed
        if(Ban_cb.getSelectedIndex() == 0){
            Roda_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else        
        Roda_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Ban "+ Ban_cb.getSelectedItem() +".png" )) );
    }//GEN-LAST:event_Ban_cbActionPerformed

    private void Badan_sport_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Badan_sport_cbActionPerformed
        
    }//GEN-LAST:event_Badan_sport_cbActionPerformed

    private void Warna_Badan_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Warna_Badan_cbActionPerformed
        if( Badan_matic_cb.getSelectedIndex() == 0 && Badan_cub_cb.getSelectedIndex() == 0 && Badan_sport_cb.getSelectedIndex() == 0){
            Body_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else
            Body_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/image/motor/Body "+ selectedbadan +" ("+ Warna_Badan_cb.getSelectedIndex() +").png" )));
    }//GEN-LAST:event_Warna_Badan_cbActionPerformed

    private void Warna_roda_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Warna_roda_cbActionPerformed
        if(Velg_cb.getSelectedIndex() == 0){
            Velg_pict.setIcon( new javax.swing.ImageIcon(getClass().getResource("")));
        }else
        Velg_pict.setIcon( new javax.swing.ImageIcon( getClass().getResource("/image/motor/Velg "+ Velg_cb.getSelectedItem() +" ("+ Warna_roda_cb.getSelectedIndex() +").png" )) );
    }//GEN-LAST:event_Warna_roda_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Badan_back;
    private javax.swing.JComboBox Badan_cub_cb;
    private javax.swing.JComboBox Badan_matic_cb;
    private javax.swing.JPanel Badan_pages;
    private javax.swing.JComboBox Badan_sport_cb;
    private javax.swing.JComboBox<String> Ban_cb;
    private javax.swing.JButton Body_pict;
    private javax.swing.JComboBox Cylinder_cb;
    private javax.swing.JTextField Diameter_tf;
    private javax.swing.JComboBox Headlamp_cb;
    private javax.swing.JComboBox Knalpot_cb;
    private javax.swing.JButton Knalpot_pict;
    private javax.swing.JPanel Kustom_pages;
    private javax.swing.JTextField Lebar_tf;
    private javax.swing.JPanel Mesin_pages;
    private javax.swing.JPanel PilihMotor_pages;
    private javax.swing.JButton Roda_back;
    private javax.swing.JPanel Roda_pages;
    private javax.swing.JButton Roda_pict;
    private javax.swing.JComboBox Seat_cb;
    private javax.swing.JTextField Tangki_tf;
    private javax.swing.JComboBox Velg_cb;
    private javax.swing.JButton Velg_pict;
    private javax.swing.JComboBox Warna_Badan_cb;
    private javax.swing.JComboBox Warna_roda_cb;
    private javax.swing.JButton background;
    private javax.swing.JButton background2;
    private javax.swing.JButton background3;
    private javax.swing.JButton btn_badan;
    private javax.swing.JButton btn_cub;
    private javax.swing.JButton btn_matic;
    private javax.swing.JButton btn_mesin;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_penyimpanan;
    private javax.swing.JButton btn_roda;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JButton btn_sport;
    private javax.swing.JComboBox cc_cub;
    private javax.swing.JButton cc_default;
    private javax.swing.JComboBox cc_matic;
    private javax.swing.JComboBox cc_sport;
    private javax.swing.JButton cub;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton matic;
    private javax.swing.JButton sport;
    private javax.swing.JTextField tf_nama_motor;
    // End of variables declaration//GEN-END:variables
    
    public void reset(){
        PilihMotor_pages.setVisible(true);
        Kustom_pages.setVisible(false);
        Mesin_pages.setVisible(true);
        Badan_pages.setVisible(false);
        Roda_pages.setVisible(false);        
        
        matic.setVisible(false);
        sport.setVisible(false);
        cub.setVisible(false);
        
        cc_default.setVisible(true);      
    }
}
