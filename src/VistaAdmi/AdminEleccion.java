package VistaAdmi;
import Controlador.*;
import Modelo.*;
import Modelo.ConsultasAlumno;
import Inicio.LoginAdministrador;
import Modelo.ConsultasDocente;
import Modelo.Docente;
import java.awt.Color;
public class AdminEleccion extends javax.swing.JFrame {

    public AdminEleccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAdmDocente = new javax.swing.JButton();
        btnAdmAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete-80_icon-icons.com_57340 (1).png"))); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 40, 40));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, -1, -1));

        jButton1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adm (1).png"))); // NOI18N
        jButton1.setText("Administrar Personal");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 270, 240));

        btnAdmDocente.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnAdmDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doc (1).png"))); // NOI18N
        btnAdmDocente.setText("Administrar docente");
        btnAdmDocente.setBorderPainted(false);
        btnAdmDocente.setContentAreaFilled(false);
        btnAdmDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmDocente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdmDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmDocenteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 280));

        btnAdmAlumno.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnAdmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alum (1).png"))); // NOI18N
        btnAdmAlumno.setText("Administrar Alumno");
        btnAdmAlumno.setBorderPainted(false);
        btnAdmAlumno.setContentAreaFilled(false);
        btnAdmAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmAlumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 260, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BIENVENIDOADMIN (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LoginAdministrador adm=new LoginAdministrador();
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAdmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmAlumnoActionPerformed
        FormAdmiAlum vista = new FormAdmiAlum();
        Alumno alumno= new Alumno();
        ConsultasAlumno modelo=new ConsultasAlumno();
        ControladorAlumno controlador = new ControladorAlumno(vista, alumno, modelo);
        controlador.iniciar();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdmAlumnoActionPerformed

    private void btnAdmDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmDocenteActionPerformed
        FormAdmiDocente vista = new FormAdmiDocente();
        Docente docente= new Docente();
        ConsultasDocente modelo=new ConsultasDocente();
        ControladorDocente controlador = new ControladorDocente(vista, docente, modelo);
        controlador.iniciar();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdmDocenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormAdmiPerson vista = new FormAdmiPerson();
        Personal personal= new Personal();
        ConsultasPersonal modelo=new ConsultasPersonal();
        ControladorPersonal controlador = new ControladorPersonal(vista, personal, modelo);
        controlador.iniciar();
        vista.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmAlumno;
    private javax.swing.JButton btnAdmDocente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
