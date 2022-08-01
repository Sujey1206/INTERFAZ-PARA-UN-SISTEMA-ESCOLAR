package VistaAdmi;
import Modelo.Docente;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

public class FormAdmiDocente extends javax.swing.JFrame {

    String tipo;

    public FormAdmiDocente() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaDocente = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cbSex = new javax.swing.JComboBox<>();
        cbSec = new javax.swing.JComboBox<>();
        cbedad = new javax.swing.JComboBox<>();
        cbCurso = new javax.swing.JComboBox<>();
        cbNivel = new javax.swing.JComboBox<>();
        cbGra = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtIddoc = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "REPORTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        JTablaDocente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JTablaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTablaDocente.setSelectionBackground(new java.awt.Color(255, 204, 204));
        JTablaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTablaDocenteMousePressed(evt);
            }
        });
        JTablaDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTablaDocenteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTablaDocente);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_book_open_search_locate_6178.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_book_open_search_locate_6178 (1).png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_book_open_search_locate_6178.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 1030, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2), "DATOS DEL DOCENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("DNI");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Apellidos");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Nombres");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Edad");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Sexo");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("Sección");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("Nivel");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("Grado");

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student_pupil_disciple_follower_adherent_apostle_icon_146774 (1).png"))); // NOI18N
        btnRegistrar.setText("  Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student_pupil_disciple_follower_adherent_apostle_icon_146774 (1).png"))); // NOI18N
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante48.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante48.png"))); // NOI18N
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-498-student-notes-note-education-4212916_114953.png"))); // NOI18N
        btnModificar.setText("   Modificar");
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-498-student-notes-note-education-4212916_114953.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar48.png"))); // NOI18N
        btnModificar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar48.png"))); // NOI18N
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo-social-web-network-internet_262_icon-icons.com_61518.png"))); // NOI18N
        btnEliminar.setText("  Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo-social-web-network-internet_262_icon-icons.com_61518.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar48.png"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar48.png"))); // NOI18N
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("Curso");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Correo Elect.");

        cbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        cbSex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A", "B" }));
        cbSec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "+55" }));
        cbedad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inicial", "Primaria", "Secundaria" }));
        cbNivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNivelActionPerformed(evt);
            }
        });

        cbGra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "3 años", "4 años", "5 años" }));
        cbGra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGraActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3792081-broom-halloween-magic-witch_109049 (1).png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3792081-broom-halloween-magic-witch_109049_1.png"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3792081-broom-halloween-magic-witch_109049 (1).png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtApe, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(cbedad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGra, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbSec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(cbSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbGra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnLimpiar))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1030, 290));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backarrow1_80790.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 80, -1));

        txtIddoc.setBackground(new java.awt.Color(255, 255, 255));
        txtIddoc.setEnabled(false);
        getContentPane().add(txtIddoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 60, 22));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura (1).png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AdminEleccion Eleccion = new AdminEleccion();
        Eleccion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGraActionPerformed

    }//GEN-LAST:event_cbGraActionPerformed

    private void cbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNivelActionPerformed
        tipo = cbNivel.getSelectedItem().toString();
        String Grado[] = {"Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto"};
        if (tipo.compareTo("Inicial") == 0) {
            cbGra.removeAllItems();
            cbGra.addItem("Seleccionar");
            for (int i = 3; i <= 5; i++) {
                cbGra.addItem(i + " años");
            }
            cbCurso.removeAllItems();
            cbCurso.addItem("Seleccionar");
            cbCurso.addItem("Comunicación");
            cbCurso.addItem("CTA");
            cbCurso.addItem("Educación Fisica");
            cbCurso.addItem("Inglés");
            cbCurso.addItem("Matemática");
            cbCurso.addItem("Personal Social");
        } else if (tipo.compareTo("Primaria") == 0) {
            cbGra.removeAllItems();
            cbGra.addItem("Seleccionar");
            for (int i = 0; i < 6; i++) {
                cbGra.addItem(Grado[i] + "");
            }
            cbCurso.removeAllItems();
            cbCurso.addItem("Seleccionar");
            cbCurso.addItem("Arte");
            cbCurso.addItem("CTA");
            cbCurso.addItem("Comunicación");
            cbCurso.addItem("Educación Fisica");
            cbCurso.addItem("Educación Religiosa");
            cbCurso.addItem("Inglés");
            cbCurso.addItem("Matemática");
            cbCurso.addItem("Personal Social");
            cbCurso.addItem("Plan Lector");
            cbCurso.addItem("Tutoría");
        } else if (tipo.compareTo("Secundaria") == 0) {
            cbGra.removeAllItems();
            cbGra.addItem("Seleccionar");
            for (int i = 0; i < 5; i++) {
                cbGra.addItem(Grado[i] + "");
            }
            cbCurso.removeAllItems();
            cbCurso.addItem("Seleccionar");
            cbCurso.addItem("Álgebra");
            cbCurso.addItem("Aritmética");
            cbCurso.addItem("Arte");
            cbCurso.addItem("Biología");
            cbCurso.addItem("Civica");
            cbCurso.addItem("Educación Fisica");
            cbCurso.addItem("Ed. para el trabajo");
            cbCurso.addItem("Educación Religiosa");
            cbCurso.addItem("Física");
            cbCurso.addItem("Geometría");
            cbCurso.addItem("Historia");
            cbCurso.addItem("Inglés");
            cbCurso.addItem("Lenguaje");
            cbCurso.addItem("Literatura");
            cbCurso.addItem("Plan Lector");
            cbCurso.addItem("Química");
            cbCurso.addItem("Raz. Matemático");
            cbCurso.addItem("Raz. Verbal");
            cbCurso.addItem("Trigonometría");
            cbCurso.addItem("Tutoría");
        } else if (tipo.compareTo("Seleccionar") == 0) {
            cbGra.removeAllItems();
            cbGra.addItem("Seleccionar");
        }
    }//GEN-LAST:event_cbNivelActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        if (txtDni.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void JTablaDocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablaDocenteMousePressed
        int seleccionar = JTablaDocente.getSelectedRow();
        txtIddoc.setText(JTablaDocente.getValueAt(seleccionar, 0).toString());
        txtDni.setText(JTablaDocente.getValueAt(seleccionar, 1).toString());
        txtApe.setText(JTablaDocente.getValueAt(seleccionar, 2).toString());
        txtNom.setText(JTablaDocente.getValueAt(seleccionar, 3).toString());
        cbedad.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 4).toString());
        cbSex.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 6).toString());
        cbSec.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 7).toString());
        cbNivel.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 8).toString());
        cbCurso.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 5).toString());
        cbGra.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 9).toString());
        txtCorreo.setText(JTablaDocente.getValueAt(seleccionar, 10).toString());

    }//GEN-LAST:event_JTablaDocenteMousePressed

    private void JTablaDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTablaDocenteKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            int seleccionar = JTablaDocente.getSelectedRow();
            txtIddoc.setText(JTablaDocente.getValueAt(seleccionar, 0).toString());
            txtDni.setText(JTablaDocente.getValueAt(seleccionar, 1).toString());
            txtApe.setText(JTablaDocente.getValueAt(seleccionar, 2).toString());
            txtNom.setText(JTablaDocente.getValueAt(seleccionar, 3).toString());
            cbedad.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 4).toString());
            cbSex.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 6).toString());
            cbSec.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 7).toString());
            cbNivel.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 8).toString());
            cbCurso.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 5).toString());
            cbGra.setSelectedItem(JTablaDocente.getValueAt(seleccionar, 9).toString());
            txtCorreo.setText(JTablaDocente.getValueAt(seleccionar, 10).toString());

        }
    }//GEN-LAST:event_JTablaDocenteKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmiDocente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable JTablaDocente;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbCurso;
    public javax.swing.JComboBox<String> cbGra;
    public javax.swing.JComboBox<String> cbNivel;
    public javax.swing.JComboBox<String> cbSec;
    public javax.swing.JComboBox<String> cbSex;
    public javax.swing.JComboBox<String> cbedad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtApe;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDni;
    public javax.swing.JLabel txtIddoc;
    public javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables

}
