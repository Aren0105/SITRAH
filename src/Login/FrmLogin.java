package Login;

import Menu_Principal.DatosSistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Menu_Principal.Frm_Menu;
import Reporte.Frm_Reporte;
import iconos.Iconos;


public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        lblHospi.setIcon(Iconos.cargar("iconos/hospital-building.svg", 70, 70));
        setLocationRelativeTo(null);
        btnIngresar.setFocusPainted(false);
        txtUsuario.setText("ej.DoctorMartinez@gmail.com");
        txtContraseña.setText("••••••••••");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel_superior = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblHospi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkMostrarContra = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));
        jPanel1.setForeground(new java.awt.Color(122, 154, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 61, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_superior.setBackground(new java.awt.Color(10, 40, 72));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(122, 154, 168));
        jLabel21.setText("°  S I S T E M A  D E  G E S T I O N  C L I N I C A");

        javax.swing.GroupLayout Panel_superiorLayout = new javax.swing.GroupLayout(Panel_superior);
        Panel_superior.setLayout(Panel_superiorLayout);
        Panel_superiorLayout.setHorizontalGroup(
            Panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        Panel_superiorLayout.setVerticalGroup(
            Panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_superiorLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jPanel2.add(Panel_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 452, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 245, 247));
        jLabel3.setText("S I T R A H");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 37));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 117, 133));
        jLabel5.setText("Sistema integrado de gestion clinica");
        jLabel5.setAutoscrolls(true);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 404, -1, 31));

        jSeparator2.setBackground(new java.awt.Color(126, 205, 216));
        jSeparator2.setForeground(new java.awt.Color(126, 205, 216));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 222, 346, 11));

        jLabel11.setFont(new java.awt.Font("SansSerif", 2, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 245, 247));
        jLabel11.setText("Cuidando vidas");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 261, 149, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 2, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 245, 247));
        jLabel12.setText("con");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 293, 42, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 2, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 205, 216));
        jLabel13.setText("precision");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 293, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 2, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 245, 247));
        jLabel14.setText("y vocacion");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 325, 111, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(126, 205, 216));
        jLabel15.setText("Lima - Peru");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 92, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("2026-SITRAH");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 522, -1, -1));
        jPanel2.add(lblHospi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 598));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 61, 74));
        jLabel2.setText("Iniciar Sesion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, 36));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(154, 188, 200));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 191, 326, 45));

        btnIngresar.setBackground(new java.awt.Color(10, 61, 74));
        btnIngresar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(238, 245, 247));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 370, 326, 43));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(122, 154, 168));
        jLabel1.setText("Ingrese sus credenciales para acceder al");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 120, 236, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 138, 154));
        jLabel4.setText("U SU A R I O");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 171, 76, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 138, 154));
        jLabel6.setText("C O N T R A S E Ñ A");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 248, -1, -1));

        chkMostrarContra.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        chkMostrarContra.setForeground(new java.awt.Color(122, 154, 171));
        chkMostrarContra.setText("Mostrar contraseña");
        chkMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarContraActionPerformed(evt);
            }
        });
        jPanel1.add(chkMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 328, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 138, 154));
        jLabel9.setText("¿Olvido su contraseña?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 333, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(126, 205, 216));
        jSeparator1.setForeground(new java.awt.Color(126, 205, 216));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 429, 326, 10));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 9)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 138, 154));
        jLabel8.setText("A C C E S O  I N S T I T U C I O N A L ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 208, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(122, 154, 168));
        jLabel10.setText("sistema de gestion hospitalaria");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 137, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setForeground(new java.awt.Color(154, 188, 200));
        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 138, 154)));
        txtContraseña.setPreferredSize(new java.awt.Dimension(172, 20));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 268, 326, 42));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(154, 188, 200));
        jLabel17.setText("Al ingresar al sistema acepta nuestras");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 536, 182, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(42, 138, 154));
        jLabel18.setText("politicas de privacidad");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 536, -1, -1));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(154, 188, 200));
        jLabel19.setText(". SITRAH");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 536, 48, -1));

        jPanel3.setBackground(new java.awt.Color(10, 40, 72));

        lblCerrar.setForeground(new java.awt.Color(154, 188, 200));
        lblCerrar.setText("   X ");
        lblCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMinimizar.setForeground(new java.awt.Color(154, 188, 200));
        lblMinimizar.setText("  ➖");
        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.setPreferredSize(new java.awt.Dimension(22, 18));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 0, 460, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        dispose();

    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked

        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String usuariox = txtUsuario.getText();
        String contraseñax = String.valueOf(txtContraseña.getPassword());

        String rol = Autenticacion.validar(usuariox, contraseñax);

        if (rol.equals("ADMIN")) {

            new Frm_Menu().setVisible(true);
            this.dispose();

        } else if (rol.equals("USUARIO")) {
            new Frm_Reporte(
                    DatosSistema.lista,
                    DatosSistema.historial,
                    true
            ).setVisible(true);

            this.dispose();

        } else {

            JOptionPane.showMessageDialog(this,
                    "Usuario o contraseña incorrectos");

        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void chkMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarContraActionPerformed

        if (chkMostrarContra.isSelected()) {
            txtContraseña.setEchoChar((char) 0);
        } else {
            txtContraseña.setEchoChar('•');
        }
    }//GEN-LAST:event_chkMostrarContraActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained

        if (txtUsuario.getText().equals("ej.DoctorMartinez@gmail.com")) {
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().trim().isEmpty()) {
            txtUsuario.setText("ej.DoctorMartinez@gmail.com");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        if (txtContraseña.getText().equals("••••••••••")) {
            txtContraseña.setText("");
        }
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        if (txtContraseña.getText().trim().isEmpty()) {
            txtContraseña.setText("••••••••••");
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_superior;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox chkMostrarContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblHospi;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
