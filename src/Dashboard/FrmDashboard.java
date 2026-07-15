package Dashboard;

import Login.FrmLogin;
import Menu_Principal.DatosSistema;
import Menu_Principal.EstilodeTabla;
import Menu_Principal.Frm_Menu;
import Menu_Principal.ListaEnlazada;
import Menu_Principal.Nodo;
import Reporte.Frm_Reporte;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import iconos.Iconos;
import iconos.IconosCargador;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmDashboard extends javax.swing.JFrame {

    ListaEnlazada lista;
    ColaPrioridad cola;
    PilaHistorial historial;

    public FrmDashboard() {
        
        initComponents();
        iconos.IconosCargador ic = new IconosCargador();
        setLocationRelativeTo(null);
        lblGrupoRegistro.setIcon(new FlatSVGIcon("iconos/account-group.svg", 60, 60));
        lblReloj.setIcon(new FlatSVGIcon("iconos/clock-time-four-outline.svg", 60, 60));
        lblAtencion.setIcon(new FlatSVGIcon("iconos/check-circle-outline.svg", 60, 60));
        lblAlerta.setIcon(new FlatSVGIcon("iconos/alert-outline.svg", 60, 60));
        lblHospital.setIcon(Iconos.cargar("iconos/hospital-building.svg", 60, 60));
        lblInicio.setIcon(Iconos.cargar("iconos/home-circle.svg"));
        lblPacien.setIcon(Iconos.cargar("iconos/account.svg"));
        lblReporte.setIcon(Iconos.cargar("iconos/file-chart.svg"));
        lblSalir.setIcon(Iconos.cargar("iconos/exit-to-app.svg"));
        lblAtender.setIcon(Iconos.cargar("iconos/check-circle-outline.svg"));
        lblVolverRegistro.setIcon(Iconos.cargar("iconos/arrow-left-circle.svg"));

        lista = DatosSistema.lista;
        cola = DatosSistema.cola;
        historial = DatosSistema.historial;

        actualizarContadores();
        actualizarTablaCola();
        actualizarTablaHistorial();
        EstilodeTabla edt = new EstilodeTabla();
        edt.aplicar(tblCola);
        edt.aplicar(tblHistorial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblHospital = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblPacien = new javax.swing.JLabel();
        lblReporte = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRegistrados = new javax.swing.JLabel();
        lblenEspera = new javax.swing.JLabel();
        lblAtendidos = new javax.swing.JLabel();
        lblCriticos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblGrupoRegistro = new javax.swing.JLabel();
        lblAtencion = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        lblAlerta = new javax.swing.JLabel();
        btnAtender = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblAtender = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCola = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        btnRegistro = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblVolverRegistro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel26.setText("jLabel26");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 612));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 40, 72));

        lblMinimizar.setForeground(new java.awt.Color(154, 188, 200));
        lblMinimizar.setText("  ➖");
        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        lblMinimizar.setPreferredSize(new java.awt.Dimension(22, 18));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblCerrar.setForeground(new java.awt.Color(154, 188, 200));
        lblCerrar.setText("   X");
        lblCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        lblCerrar.setPreferredSize(new java.awt.Dimension(22, 18));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(122, 154, 168));
        jLabel25.setText("SISTEMA DE TRIAJE HOSPITALARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 793, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lblCerrar.getAccessibleContext().setAccessibleName("  X");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jPanel3.setBackground(new java.awt.Color(10, 61, 74));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 110));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 245, 247));
        jLabel5.setText("SITRAH");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(126, 205, 216));
        jLabel7.setText("   Lima -Peru");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 245, 247));
        jLabel8.setText("Inicio");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 245, 247));
        jLabel15.setText("Pacientes");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 245, 247));
        jLabel16.setText("Reporte");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 245, 247));
        jLabel17.setText("Salir");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 245, 247));
        jLabel18.setText("Cuidando");

        jLabel19.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 245, 247));
        jLabel19.setText("vidas");

        jLabel20.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 245, 247));
        jLabel20.setText("con");

        jLabel21.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(126, 205, 216));
        jLabel21.setText("precision");

        jLabel22.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(238, 245, 247));
        jLabel22.setText("y vocacion");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(238, 245, 247));
        jLabel23.setText("2026 - SITRAH ");

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 117, 133));
        jLabel24.setText("Ssitema integrado de gestion clinica");

        jSeparator1.setBackground(new java.awt.Color(126, 205, 216));
        jSeparator1.setForeground(new java.awt.Color(126, 205, 216));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPacien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblPacien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 160, 590));

        jLabel1.setBackground(new java.awt.Color(10, 61, 74));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 74));
        jLabel1.setText("Registrados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 80, 90, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("En espera");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 90, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Atendidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 80, 90, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Criticos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 80, 80, 40));

        lblRegistrados.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jPanel1.add(lblRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 132, 70, 30));

        lblenEspera.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jPanel1.add(lblenEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 63, 40));

        lblAtendidos.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jPanel1.add(lblAtendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 52, 40));

        lblCriticos.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jPanel1.add(lblCriticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 52, 40));

        jLabel9.setBackground(new java.awt.Color(10, 61, 74));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 61, 74));
        jLabel9.setText("Total general ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 186, 100, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Pacientes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 186, 80, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 0));
        jLabel11.setText("Pacientes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 186, 80, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Pacientes");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 186, 80, -1));
        jPanel1.add(lblGrupoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 112, 71, 80));
        jPanel1.add(lblAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 68, 67));
        jPanel1.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 121, 68, 67));
        jPanel1.add(lblAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 112, 70, 80));

        btnAtender.setBackground(new java.awt.Color(25, 110, 85));
        btnAtender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtenderMouseClicked(evt);
            }
        });
        btnAtender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 245, 247));
        jLabel13.setText("Atender");
        btnAtender.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        btnAtender.add(lblAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jPanel1.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 566, 138, 40));

        tblCola.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblCola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "CODIGO", "NOMBRE", "PRIORIDAD", "HORA"
            }
        ));
        tblCola.setSelectionBackground(new java.awt.Color(10, 40, 72));
        tblCola.setSelectionForeground(new java.awt.Color(154, 188, 200));
        jScrollPane1.setViewportView(tblCola);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 227, 389, 325));

        tblHistorial.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HORA", "ACCION"
            }
        ));
        tblHistorial.setSelectionBackground(new java.awt.Color(10, 40, 72));
        tblHistorial.setSelectionForeground(new java.awt.Color(154, 188, 200));
        jScrollPane2.setViewportView(tblHistorial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 227, 390, 325));

        btnRegistro.setBackground(new java.awt.Color(39, 118, 245));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 245, 247));
        jLabel14.setText("Registro");

        javax.swing.GroupLayout btnRegistroLayout = new javax.swing.GroupLayout(btnRegistro);
        btnRegistro.setLayout(btnRegistroLayout);
        btnRegistroLayout.setHorizontalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistroLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblVolverRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnRegistroLayout.setVerticalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistroLayout.createSequentialGroup()
                .addGroup(btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(lblVolverRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 566, -1, 40));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 138, 41, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked

        setState(FrmDashboard.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked

        dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnAtenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtenderMouseClicked

        Nodo paciente = cola.atender();
        if (paciente == null) {
            JOptionPane.showMessageDialog(this, "No hay pacientes en espera");
            return;
        }
        paciente.setEstado("Atendido");

        historial.push(
                LocalTime.now()
                        .format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                + " | Atendido: "
                + paciente.getCodigoPaciente()
                + " - "
                + paciente.getNombre()
                + " "
                + paciente.getApellido()
                + " ["
                + paciente.getPrioridad()
                + "]"
        );

        actualizarContadores();
        actualizarTablaCola();
        actualizarTablaHistorial();
    }//GEN-LAST:event_btnAtenderMouseClicked

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked

        Frm_Menu menu = new Frm_Menu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        new FrmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Frm_Menu().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        new Frm_Reporte(lista, historial).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void actualizarContadores() {
        lblRegistrados.setText(
                String.valueOf(lista.totalPacientes())
        );

        lblenEspera.setText(
                String.valueOf(lista.totalEnEspera())
        );

        lblAtendidos.setText(
                String.valueOf(lista.totalAtendidos())
        );

        lblCriticos.setText(
                String.valueOf(lista.totalCriticos())
        );
    }

    private void actualizarTablaCola() {

        DefaultTableModel modelo = (DefaultTableModel) tblCola.getModel();

        modelo.setRowCount(0);
        int numero = 1;

        NodoCola actual;

        actual = cola.getInicioEmergencia();

        while (actual != null) {

            Nodo p = actual.getPaciente();

            modelo.addRow(new Object[]{
                numero++,
                p.getCodigoPaciente(),
                p.getNombre() + " " + p.getApellido(),
                p.getPrioridad(),
                p.getHoraIngreso()
            });

            actual = actual.getSiguiente();
        }

        actual = cola.getInicioUrgente();

        while (actual != null) {

            Nodo p = actual.getPaciente();

            modelo.addRow(new Object[]{
                numero++,
                p.getCodigoPaciente(),
                p.getNombre() + " " + p.getApellido(),
                p.getPrioridad(),
                p.getHoraIngreso()
            });

            actual = actual.getSiguiente();
        }

        actual = cola.getInicioLeve();

        while (actual != null) {

            Nodo p = actual.getPaciente();

            modelo.addRow(new Object[]{
                numero++,
                p.getCodigoPaciente(),
                p.getNombre() + " " + p.getApellido(),
                p.getPrioridad(),
                p.getHoraIngreso()
            });

            actual = actual.getSiguiente();
        }
    }

    private void actualizarTablaHistorial() {

        DefaultTableModel modelo = (DefaultTableModel) tblHistorial.getModel();
        modelo.setRowCount(0);
        NodoPila actual = historial.getCima();

        while (actual != null) {
            String texto = actual.getAccion();
            String hora = "";
            String accion = texto;

            if (texto.contains("|")) {

                String[] partes = texto.split("\\|", 2);

                hora = partes[0].trim();
                accion = partes[1].trim();
            }

            modelo.addRow(new Object[]{
                hora,
                accion
            });

            actual = actual.getSiguiente();
        }
    }

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
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAtender;
    private javax.swing.JPanel btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblAtencion;
    private javax.swing.JLabel lblAtender;
    private javax.swing.JLabel lblAtendidos;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCriticos;
    private javax.swing.JLabel lblGrupoRegistro;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPacien;
    private javax.swing.JLabel lblRegistrados;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblVolverRegistro;
    private javax.swing.JLabel lblenEspera;
    private javax.swing.JTable tblCola;
    private javax.swing.JTable tblHistorial;
    // End of variables declaration//GEN-END:variables
}
