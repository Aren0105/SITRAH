package Reporte;

import static Menu_Principal.DatosSistema.cola;
import Menu_Principal.Nodo;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Frm_Reporte extends javax.swing.JFrame {

    public Frm_Reporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDniBuscar = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVisorReporte = new javax.swing.JTextArea();
        btnExportarPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jLabel1.setText("REPORTE DE ATENCION DE CLIENTE ");

        jLabel2.setText("INGRESE DNI :");

        btnBuscarPaciente.setText("BUSCAR PACIENTE");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        txtVisorReporte.setColumns(20);
        txtVisorReporte.setRows(5);
        jScrollPane1.setViewportView(txtVisorReporte);

        btnExportarPdf.setText("EXPORTAR");
        btnExportarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExportarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPaciente))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnExportarPdf)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        String dniBuscado = txtDniBuscar.getText().trim();

        if (dniBuscado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de DNI.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        Menu_Principal.Nodo paciente = Reporte.GestorReporte.buscarPorDni(cola, dniBuscado);

        if (paciente != null) {
            String reporteFormateado
                    = "\t\tINFORME DE TRIAJE HOSPITALARIO\n\n"
                    + "PACIENTE            : " + paciente.getNombre() + " " + paciente.getApellido() + "\n"
                    + "DNI                 : " + paciente.getDni() + "\n"
                    + "EDAD                : " + paciente.getEdad() + " años\n"
                    + "SEXO                : " + paciente.getSexo() + "\n"
                    + "TELÉFONO            : " + paciente.getTelefono() + "\n"
                    + "FECHA DE ATENCIÓN   : " + LocalDate.now() + "\n"
                    + "\n------------------------------------------------------------\n\n"
                    + "MOTIVO DE CONSULTA\n\n"
                    + paciente.getMotivo() + "\n"
                    + "\n------------------------------------------------------------\n\n"
                    + "EVALUACIÓN DE TRIAJE\n\n"
                    + "Prioridad: " + paciente.getPrioridad().toUpperCase() + "\n"
                    + "\n------------------------------------------------------------\n\n"
                    + "OBSERVACIONES\n\n"
                    + "Reporte generado automáticamente por el Sistema de Triaje Hospitalario (SITRAH).";

            txtVisorReporte.setText(reporteFormateado);
            btnExportarPdf.setEnabled(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "El DNI no figura en las listas de triaje actuales.", "Paciente no encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtVisorReporte.setText("");
            btnExportarPdf.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnExportarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarPdfActionPerformed

        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Guardar PDF");

        int opcion = selector.showSaveDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            String ruta = selector.getSelectedFile().getAbsolutePath();

            if (!ruta.toLowerCase().endsWith(".pdf")) {
                ruta += ".pdf";
            }

            String dni = txtDniBuscar.getText().trim();

            Nodo paciente = Reporte.GestorReporte.buscarPorDni(cola, dni);

            if (paciente == null) {
                JOptionPane.showMessageDialog(this, "No existe el paciente.");
                return;
            }

            boolean exito = Reporte.GestorReporte.exportarFichaPdf(ruta, paciente);

            if (exito) {
                JOptionPane.showMessageDialog(this, "PDF generado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al generar el PDF.");
            }
        }


    }//GEN-LAST:event_btnExportarPdfActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Reporte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Reporte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Reporte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Reporte.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnExportarPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDniBuscar;
    private javax.swing.JTextArea txtVisorReporte;
    // End of variables declaration//GEN-END:variables
}
