package Inicio;
import Controlador.ControladorCuentas;
import Modelo.ConsultasAlumno;
import Modelo.ConsultasCuentas;
import Modelo.ConsultasCuentasA;
import Modelo.ConsultasDocente;
import Modelo.Cuentas;
import VistaDocente.FormDocente;
import java.awt.Color;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btndoc = new javax.swing.JButton();
        btnAlum = new javax.swing.JButton();
        btnadmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnHorarios = new javax.swing.JButton();
        btnTutorias = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnAnuncio = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doc.png"))); // NOI18N
        btndoc.setText("        DOCENTE");
        btndoc.setBorderPainted(false);
        btndoc.setContentAreaFilled(false);
        btndoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocActionPerformed(evt);
            }
        });
        jPanel1.add(btndoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 220, 70));

        btnAlum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alum.png"))); // NOI18N
        btnAlum.setText("  ALUMNO");
        btnAlum.setBorderPainted(false);
        btnAlum.setContentAreaFilled(false);
        btnAlum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 180, 60));

        btnadmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        btnadmin.setText("  ADMINISTRADOR");
        btnadmin.setBorderPainted(false);
        btnadmin.setContentAreaFilled(false);
        btnadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jPanel1.add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LEMAF.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 310, 140));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 40, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 32)); // NOI18N
        jLabel3.setText("C.E.P MARÍA MONTESSORI EIRL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 32)); // NOI18N
        jLabel4.setText("Bienvenido al colegio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Parrafo.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 750, 210));

        btnHorarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/calendar_date_event_schedule_icon_127191 (2) (1).png"))); // NOI18N
        btnHorarios.setText("Horarios de atención");
        btnHorarios.setBorderPainted(false);
        btnHorarios.setContentAreaFilled(false);
        btnHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHorarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/calendar_date_event_schedule_icon_127191 (2) (1).png"))); // NOI18N
        btnHorarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/calendar_date_event_schedule_icon_127191 (2) (1) (1).png"))); // NOI18N
        btnHorarios.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/calendar_date_event_schedule_icon_127191 (2) (1) (1).png"))); // NOI18N
        btnHorarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/calendar_date_event_schedule_icon_127191 (2) (1).png"))); // NOI18N
        btnHorarios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHorarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 270, 230));

        btnTutorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTutorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tutoria (2) (1).png"))); // NOI18N
        btnTutorias.setText("Tutorias");
        btnTutorias.setBorderPainted(false);
        btnTutorias.setContentAreaFilled(false);
        btnTutorias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTutorias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tutoria (2) (1) (1).png"))); // NOI18N
        btnTutorias.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tutoria (2) (1).png"))); // NOI18N
        btnTutorias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnTutorias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTutorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutoriasActionPerformed(evt);
            }
        });
        jPanel1.add(btnTutorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 270, 230));

        btnServicios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/educacion-en-linea (1).png"))); // NOI18N
        btnServicios.setText("Servicios Educativos");
        btnServicios.setBorderPainted(false);
        btnServicios.setContentAreaFilled(false);
        btnServicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServicios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/educacion-en-linea (1) (1).png"))); // NOI18N
        btnServicios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/educacion-en-linea (1).png"))); // NOI18N
        btnServicios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnServicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 270, 230));

        btnAnuncio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAnuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/announcement_88978.png"))); // NOI18N
        btnAnuncio.setText("     Anuncio");
        btnAnuncio.setBorderPainted(false);
        btnAnuncio.setContentAreaFilled(false);
        btnAnuncio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnuncio.setDefaultCapable(false);
        btnAnuncio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/announcement_88978 (1).png"))); // NOI18N
        btnAnuncio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/announcement_88978.png"))); // NOI18N
        btnAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnuncioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 630, -1, 80));

        btnInformacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/User_Manual-80_icon-icons.com_57245.png"))); // NOI18N
        btnInformacion.setBorderPainted(false);
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/User_Manual-80_icon-icons.com_57245.png"))); // NOI18N
        btnInformacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/User_Manual-80_icon-icons.com_57245 (1).png"))); // NOI18N
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, 70));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDOMENU.png"))); // NOI18N
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocActionPerformed
        ConsultasDocente modeloD = new ConsultasDocente();
        LoginDocente vista = new LoginDocente();
        Cuentas cuentas = new Cuentas();
        ConsultasCuentas modeloCD= new ConsultasCuentas();
        ControladorCuentas controlador = new ControladorCuentas(vista, cuentas, modeloCD, modeloD);
        controlador.iniciarD();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btndocActionPerformed

    private void btnAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumActionPerformed
        ConsultasAlumno modeloA = new ConsultasAlumno();
        LoginAlumno vista = new LoginAlumno();
        Cuentas cuentas = new Cuentas();
        ConsultasCuentasA modeloCA= new ConsultasCuentasA();
        ControladorCuentas controlador = new ControladorCuentas(vista, cuentas, modeloCA, modeloA);
        controlador.iniciarA();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlumActionPerformed

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        LoginAdministrador admin = new LoginAdministrador();
        dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
       Horarios horario = new Horarios();
       horario.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
       Servicios servicios = new Servicios();
       servicios.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnTutoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutoriasActionPerformed
       Tutorias tutoria = new Tutorias();
       tutoria.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnTutoriasActionPerformed

    private void btnAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnuncioActionPerformed
       Anuncio anuncio = new Anuncio();
       anuncio.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnAnuncioActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
       Informacion informacion = new Informacion();
       informacion.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnInformacionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlum;
    private javax.swing.JButton btnAnuncio;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnTutorias;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btndoc;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables

}
