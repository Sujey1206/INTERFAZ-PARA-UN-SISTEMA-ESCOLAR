package Controlador;

import Modelo.ConsultasDocente;
import Modelo.Docente;
import VistaAdmi.FormAdmiDocente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorDocente implements ActionListener {

    private FormAdmiDocente vista;
    private Docente docente;
    private ConsultasDocente modelo;

    public ControladorDocente(FormAdmiDocente vista, Docente docente, ConsultasDocente modelo) {
        this.vista = vista;
        this.docente = docente;
        this.modelo = modelo;
        vista.btnRegistrar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        MostrarDatos();
        vista.txtIddoc.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnRegistrar) {
            docente.setDni(Integer.parseInt(vista.txtDni.getText()));
            docente.setApe(vista.txtApe.getText());
            docente.setNom(vista.txtNom.getText());
            docente.setEdad(Integer.parseInt(vista.cbedad.getSelectedItem().toString()));
            docente.setCurso(vista.cbCurso.getSelectedItem().toString());
            docente.setSex(vista.cbSex.getSelectedItem().toString());
            docente.setSeccion(vista.cbSec.getSelectedItem().toString());
            docente.setNivel(vista.cbNivel.getSelectedItem().toString());
            docente.setGrado(vista.cbGra.getSelectedItem().toString());
            docente.setCorreo(vista.txtCorreo.getText());
            if (modelo.insertar(docente)) {
                JOptionPane.showMessageDialog(null, "Docente registrado  correctamente", "AVISO", 1);
                MostrarDatos();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar", "ERROR", 0);
                limpiar();
            }
        }
        if (ae.getSource() == vista.btnLimpiar) {
            limpiar();
        }
        if (ae.getSource() == vista.btnBuscar) {
            Object[] cabecera = {"  ", "DNI", "APELLIDOS", "NOMBRES", "EDAD", "CURSO", "SEXO", "SECCIÓN", "NIVEL", "GRADO", "CORREO"};
            TableModel model = new DefaultTableModel(cabecera, tamañoB());
            int i = 0;
            for (Docente a : modelo.listar()) {
                if (vista.txtBuscar.getText().compareTo(a.getDni() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getApe()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNom()) == 0 || vista.txtBuscar.getText().compareTo(a.getEdad() + "") == 0
                        || vista.txtBuscar.getText().compareTo(a.getSex()) == 0 || vista.txtBuscar.getText().compareTo(a.getSeccion()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNivel()) == 0 || vista.txtBuscar.getText().compareTo(a.getGrado()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getCurso()) == 0 || vista.txtBuscar.getText().compareTo(a.getCorreo()) == 0) {
                    model.setValueAt(a.getIddoc(), i, 0);
                    model.setValueAt(a.getDni(), i, 1);
                    model.setValueAt(a.getApe(), i, 2);
                    model.setValueAt(a.getNom(), i, 3);
                    model.setValueAt(a.getEdad(), i, 4);
                    model.setValueAt(a.getCurso(), i, 5);
                    model.setValueAt(a.getSex(), i, 6);
                    model.setValueAt(a.getSeccion(), i, 7);
                    model.setValueAt(a.getNivel(), i, 8);
                    model.setValueAt(a.getGrado(), i, 9);
                    model.setValueAt(a.getCorreo(), i, 10);
                    i++;
                }
            }
            vista.JTablaDocente.setModel(model);
            if (vista.txtBuscar.getText().isEmpty()) {
                MostrarDatos();
            }
        }
        if (ae.getSource() == vista.btnModificar) {
            docente.setIddoc(Integer.parseInt(vista.txtIddoc.getText()));
            docente.setDni(Integer.parseInt(vista.txtDni.getText()));
            docente.setApe(vista.txtApe.getText());
            docente.setNom(vista.txtNom.getText());
            docente.setEdad(Integer.parseInt(vista.cbedad.getSelectedItem().toString()));
            docente.setCurso(vista.cbCurso.getSelectedItem().toString());
            docente.setSex(vista.cbSex.getSelectedItem().toString());
            docente.setSeccion(vista.cbSec.getSelectedItem().toString());
            docente.setNivel(vista.cbNivel.getSelectedItem().toString());
            docente.setGrado(vista.cbGra.getSelectedItem().toString());
            docente.setCorreo(vista.txtCorreo.getText());
            if (modelo.modificar(docente)) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "AVISO", 1);
                MostrarDatos();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro", "ERROR", 0);
                limpiar();
            }
        }
        if (ae.getSource() == vista.btnEliminar) {
            docente.setIddoc(Integer.parseInt(vista.txtIddoc.getText()));
            System.out.println(" " + vista.txtIddoc.getText());
            if (modelo.eliminar(docente)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "AVISO", 1);
                MostrarDatos();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro", "ERROR", 0);
                limpiar();
            }
        }
    }

    public int tamañoB() {
        int tam = 0;
        for (Docente a : modelo.listar()) {
                if (vista.txtBuscar.getText().compareTo(a.getDni() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getApe()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNom()) == 0 || vista.txtBuscar.getText().compareTo(a.getEdad() + "") == 0
                        || vista.txtBuscar.getText().compareTo(a.getSex()) == 0 || vista.txtBuscar.getText().compareTo(a.getSeccion()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNivel()) == 0 || vista.txtBuscar.getText().compareTo(a.getGrado()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getCurso()) == 0 || vista.txtBuscar.getText().compareTo(a.getCorreo()) == 0) {
                    tam++;
            }
        }
        return tam;
    }

    public void limpiar() {
        vista.txtIddoc.setText("");
        vista.txtDni.setText("");
        vista.txtApe.setText("");
        vista.txtNom.setText("");
        vista.cbedad.setSelectedIndex(0);
        vista.cbCurso.setSelectedIndex(0);
        vista.cbSex.setSelectedIndex(0);
        vista.cbSec.setSelectedIndex(0);
        vista.cbNivel.setSelectedIndex(0);
        vista.cbGra.setSelectedIndex(0);
        vista.txtCorreo.setText("");
    }

    public void MostrarDatos() {
        Object[] cabecera = {"  ", "DNI", "APELLIDOS", "NOMBRES", "EDAD", "CURSO", "SEXO", "SECCIÓN", "NIVEL", "GRADO", "CORREO"};
        TableModel model = new DefaultTableModel(cabecera, modelo.listar().size());
        int i = 0;
        for (Docente a : modelo.listar()) {
            model.setValueAt(a.getIddoc(), i, 0);
            model.setValueAt(a.getDni(), i, 1);
            model.setValueAt(a.getApe(), i, 2);
            model.setValueAt(a.getNom(), i, 3);
            model.setValueAt(a.getEdad(), i, 4);
            model.setValueAt(a.getCurso(), i, 5);
            model.setValueAt(a.getSex(), i, 6);
            model.setValueAt(a.getSeccion(), i, 7);
            model.setValueAt(a.getNivel(), i, 8);
            model.setValueAt(a.getGrado(), i, 9);
            model.setValueAt(a.getCorreo(), i, 10);
            i++;
        }
        vista.JTablaDocente.setModel(model);
    }
}
