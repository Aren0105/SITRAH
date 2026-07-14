package Reporte;

import Dashboard.PilaHistorial;
import Login.FrmLogin;
import Menu_Principal.DatosSistema;
import Menu_Principal.Frm_Menu;
import Menu_Principal.ListaEnlazada;
import Menu_Principal.Nodo;
import iconos.Iconos;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Frm_Reporte extends javax.swing.JFrame {

    private ListaEnlazada lista;
    private PilaHistorial historial;

    public Frm_Reporte() {
        initComponents();
        setLocationRelativeTo(null);

        txtDniBuscar.setEditable(true);
        setLocationRelativeTo(null);
        lblBuscar.setIcon(Iconos.cargarOriginal("iconos/search-web.svg", 22, 22));
        lblLogoPaciente.setIcon(Iconos.cargarOriginal("iconos/account.svg", 25, 25));
        lblLogo.setIcon(Iconos.cargar("iconos/hospital-building.svg", 70, 70));
        lblInicio.setIcon(Iconos.cargar("iconos/home-circle.svg", 32, 32));
        lblPacientes.setIcon(Iconos.cargar("iconos/account.svg", 32, 32));
        lblReporte.setIcon(Iconos.cargar("iconos/file-chart.svg", 32, 32));
        lblSalir.setIcon(Iconos.cargar("iconos/exit-to-app.svg", 32, 32));

        this.lista = DatosSistema.lista;
        this.historial = DatosSistema.historial;
    }

    public Frm_Reporte(ListaEnlazada lista, PilaHistorial historial) {
        this();

        this.lista = lista;
        this.historial = historial;
    }

    public Frm_Reporte(ListaEnlazada lista, PilaHistorial historial, boolean usuario) {

        this(lista, historial);

        if (usuario) {

            lblInicio.setVisible(false);
            lblMandarInicio.setVisible(false);

            lblPacientes.setVisible(false);
            lblMnadaraMenu.setVisible(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMandarInicio = new javax.swing.JLabel();
        lblMnadaraMenu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCerrarSalir = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblInicio = new javax.swing.JLabel();
        lblPacientes = new javax.swing.JLabel();
        lblReporte = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExportarPdf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVisorReporte = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDniBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarPaciente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblLogoPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 247, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 612));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 61, 74));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 245, 247));
        jLabel5.setText("SITRAH");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(126, 205, 216));
        jLabel6.setText("Lima - Peru");

        lblMandarInicio.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblMandarInicio.setForeground(new java.awt.Color(238, 245, 247));
        lblMandarInicio.setText("Inicio");
        lblMandarInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMandarInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMandarInicioMouseClicked(evt);
            }
        });

        lblMnadaraMenu.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblMnadaraMenu.setForeground(new java.awt.Color(238, 245, 247));
        lblMnadaraMenu.setText("Pacientes");
        lblMnadaraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMnadaraMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMnadaraMenuMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 245, 247));
        jLabel9.setText("Reporte");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblCerrarSalir.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblCerrarSalir.setForeground(new java.awt.Color(238, 245, 247));
        lblCerrarSalir.setText("Salir");
        lblCerrarSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSalirMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 245, 247));
        jLabel11.setText("Cuidando  vidas");

        jLabel12.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 245, 247));
        jLabel12.setText("con");

        jLabel13.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 205, 216));
        jLabel13.setText("precision");

        jLabel14.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 245, 247));
        jLabel14.setText("y  vocacion");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 117, 133));
        jLabel15.setText("Sistema integrado de gestion clinica");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("2026-SITRAH");

        jSeparator2.setBackground(new java.awt.Color(126, 205, 216));
        jSeparator2.setForeground(new java.awt.Color(126, 205, 216));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)))
                                    .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMandarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMnadaraMenu)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCerrarSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMandarInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblMnadaraMenu)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCerrarSalir)
                    .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 170, 580));

        jPanel3.setBackground(new java.awt.Color(10, 40, 72));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(122, 154, 168));
        jLabel17.setText("° SISTEMA DE TRIAJE HOSPITALARIO");

        lblMinimizar.setForeground(new java.awt.Color(154, 188, 200));
        lblMinimizar.setText("   ➖");
        lblMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblCerrar.setForeground(new java.awt.Color(154, 188, 200));
        lblCerrar.setText("   X");
        lblCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 74));
        jLabel1.setText("Reporte de paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        btnExportarPdf.setBackground(new java.awt.Color(10, 61, 74));
        btnExportarPdf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnExportarPdf.setForeground(new java.awt.Color(238, 245, 247));
        btnExportarPdf.setText("EXPORTAR");
        btnExportarPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarPdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportarPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 504, 130, 40));

        txtVisorReporte.setBackground(new java.awt.Color(245, 247, 250));
        txtVisorReporte.setColumns(20);
        txtVisorReporte.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtVisorReporte.setForeground(new java.awt.Color(154, 188, 200));
        txtVisorReporte.setRows(5);
        txtVisorReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));
        jScrollPane1.setViewportView(txtVisorReporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 390, 250));

        jSeparator1.setBackground(new java.awt.Color(154, 188, 200));
        jSeparator1.setForeground(new java.awt.Color(154, 188, 200));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 940, 40));

        jPanel4.setBackground(new java.awt.Color(245, 247, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 188, 200)));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI:");

        txtDniBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtDniBuscar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtDniBuscar.setForeground(new java.awt.Color(154, 188, 200));
        txtDniBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtDniBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(154, 188, 200));
        jLabel3.setText("Ingrese el numero de dni ( 8 digitos )");

        btnBuscarPaciente.setBackground(new java.awt.Color(10, 61, 74));
        btnBuscarPaciente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(238, 245, 247));
        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 61, 74));
        jLabel4.setText("BUSQUEDA DE PACIENTE POR DNI");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 520, 140));
        jPanel1.add(lblLogoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        String dniBuscado = txtDniBuscar.getText().trim();

        if (dniBuscado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de DNI.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        Nodo paciente = Reporte.GestorReporte.buscarPorDni(lista, dniBuscado);

        if (paciente != null && !paciente.getEstado().equals("Atendido")) {

            JOptionPane.showMessageDialog(this,
                    "El paciente todavía no ha sido atendido.",
                    "Reporte no disponible",
                    JOptionPane.INFORMATION_MESSAGE);

            txtVisorReporte.setText("");
            btnExportarPdf.setEnabled(false);
            return;
        }

        if (paciente != null) {
            String reporteFormateado
                    = "\t\tINFORME DE TRIAJE HOSPITALARIO\n\n"
                    + "PACIENTE            : " + paciente.getNombre() + " " + paciente.getApellido() + "\n"
                    + "DNI                 : " + paciente.getDni() + "\n"
                    + "EDAD                : " + paciente.getEdad() + " años\n"
                    + "SEXO                : " + paciente.getSexo() + "\n"
                    + "TELÉFONO            : " + paciente.getTelefono() + "\n"
                    + "ESTADO             : " + paciente.getEstado() + "\n"
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

            Nodo paciente = Reporte.GestorReporte.buscarPorDni(lista, dni);

            if (paciente != null && !paciente.getEstado().equals("Atendido")) {

                JOptionPane.showMessageDialog(this,
                        "El paciente aún no ha sido atendido.");

                return;
            }

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

    private void txtDniBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniBuscarActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        setState(Frm_Reporte.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        dispose();


    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMandarInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMandarInicioMouseClicked
        new FrmLogin().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblMandarInicioMouseClicked

    private void lblMnadaraMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMnadaraMenuMouseClicked

        new Frm_Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMnadaraMenuMouseClicked

    private void lblCerrarSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSalirMouseClicked

        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCerrarSalirMouseClicked

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCerrarSalir;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoPaciente;
    private javax.swing.JLabel lblMandarInicio;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMnadaraMenu;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextField txtDniBuscar;
    private javax.swing.JTextArea txtVisorReporte;
    // End of variables declaration//GEN-END:variables
}
