package Controlador;

import Modelo.ConsultasAlumno;
import Modelo.Alumno;
import VistaAdmi.FormAdmiAlum;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorAlumno implements ActionListener {

    private FormAdmiAlum vista;
    private Alumno alumno;
    private ConsultasAlumno modelo;

    public ControladorAlumno(FormAdmiAlum vista, Alumno alumno, ConsultasAlumno modelo) {
        this.vista = vista;
        this.alumno = alumno;
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
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnRegistrar) {
            try {
                alumno.setDni(Integer.parseInt(vista.txtDni.getText()));
                alumno.setApe(vista.txtApe.getText());
                alumno.setNom(vista.txtNom.getText());
                alumno.setEdad(Integer.parseInt(vista.cbedad.getSelectedItem().toString()));
                alumno.setSex(vista.cbSex.getSelectedItem().toString());
                alumno.setSeccion(vista.cbSec.getSelectedItem().toString());
                alumno.setNivel(vista.cbnivel.getSelectedItem().toString());
                alumno.setGrado(vista.cbGra.getSelectedItem().toString());
                alumno.setTotal(total());
                if (modelo.insertar(alumno)) {
                    JOptionPane.showMessageDialog(null, "Alumno registrado  correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor");
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numerico en la cantidad");
                }
                vista.txtDni.setText("");
            }
        }
        if (ae.getSource() == vista.btnLimpiar) {
            limpiar();
        }
        if (ae.getSource() == vista.btnBuscar) {
            Object[] cabecera = {"DNI", "APELLIDOS", "NOMBRES", "EDAD", "SEXO", "SECCIÓN", "NIVEL", "GRADO", "COSTO TOTAL"};
            TableModel model = new DefaultTableModel(cabecera, tamañoB());
            int i = 0;
            for (Alumno a : modelo.listar()) {
                if (vista.txtBuscar.getText().compareTo(a.getDni() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getApe()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNom()) == 0 || vista.txtBuscar.getText().compareTo(a.getEdad() + "") == 0
                        || vista.txtBuscar.getText().compareTo(a.getSex()) == 0 || vista.txtBuscar.getText().compareTo(a.getSeccion()) == 0
                        || vista.txtBuscar.getText().compareTo(a.getNivel()) == 0 || vista.txtBuscar.getText().compareTo(a.getGrado()) == 0) {
                    model.setValueAt(a.getDni(), i, 0);
                    model.setValueAt(a.getApe(), i, 1);
                    model.setValueAt(a.getNom(), i, 2);
                    model.setValueAt(a.getEdad(), i, 3);
                    model.setValueAt(a.getSex(), i, 4);
                    model.setValueAt(a.getSeccion(), i, 5);
                    model.setValueAt(a.getNivel(), i, 6);
                    model.setValueAt(a.getGrado(), i, 7);
                    model.setValueAt(a.getTotal(), i, 8);
                    i++;
                }
            }
            vista.JtablaAlumno.setModel(model);
            if (vista.txtBuscar.getText().isEmpty()) {
                MostrarDatos();
            }
        }
        if (ae.getSource() == vista.btnModificar) {
            try {
                alumno.setDni(Integer.parseInt(vista.txtDni.getText()));
                alumno.setApe(vista.txtApe.getText());
                alumno.setNom(vista.txtNom.getText());
                alumno.setEdad(Integer.parseInt(vista.cbedad.getSelectedItem().toString()));
                alumno.setSex(vista.cbSex.getSelectedItem().toString());
                alumno.setSeccion(vista.cbSec.getSelectedItem().toString());
                alumno.setNivel(vista.cbnivel.getSelectedItem().toString());
                alumno.setGrado(vista.cbGra.getSelectedItem().toString());
                alumno.setTotal(total());
                if (modelo.modificar(alumno)) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para actualizar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para actualizar");
                }
                vista.txtDni.setText("");
            }
        }
        if (ae.getSource() == vista.btnEliminar) {
            try {
                alumno.setDni(Integer.parseInt(vista.txtDni.getText()));
                if (modelo.eliminar(alumno)) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para eliminar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para eliminar");
                }
                vista.txtDni.setText("");
            }
        }
    }

    public void limpiar() {
        vista.txtDni.setText("");
        vista.txtApe.setText("");
        vista.txtNom.setText("");
        vista.cbedad.setSelectedIndex(0);
        vista.cbSex.setSelectedIndex(0);
        vista.cbSec.setSelectedIndex(0);
        vista.cbnivel.setSelectedIndex(0);
        vista.cbGra.setSelectedIndex(0);
        vista.txtPensiIni.setText("");
        vista.txtPensiSec.setText("");
        vista.txtPensiPri.setText("");
        vista.lblExtra.setText("");

    }

    public int tamañoB() {
        int tam = 0;
        for (Alumno a : modelo.listar()) {
            if (vista.txtBuscar.getText().compareTo(a.getDni() + "") == 0 || vista.txtBuscar.getText().compareTo(a.getApe()) == 0
                    || vista.txtBuscar.getText().compareTo(a.getNom()) == 0 || vista.txtBuscar.getText().compareTo(a.getEdad() + "") == 0
                    || vista.txtBuscar.getText().compareTo(a.getSex()) == 0 || vista.txtBuscar.getText().compareTo(a.getSeccion()) == 0
                    || vista.txtBuscar.getText().compareTo(a.getNivel()) == 0 || vista.txtBuscar.getText().compareTo(a.getGrado()) == 0) {
                tam++;
            }
        }
        return tam;
    }

    public float total() {
        float tot = 0;
        if (vista.cbnivel.getSelectedItem().toString().compareTo("Inicial") == 0) {
            tot = (float) (120 * 1.1);
        } else if (vista.cbnivel.getSelectedItem().toString().compareTo("Primaria") == 0) {
            tot = (float) (180 * 1.1);
        } else if (vista.cbnivel.getSelectedItem().toString().compareTo("Secundaria") == 0) {
            tot = (float) (250 * 1.1);
        }
        return tot;
    }

    public void MostrarDatos() {
        Object[] cabecera = {"DNI", "APELLIDOS", "NOMBRES", "EDAD", "SEXO", "SECCIÓN", "NIVEL", "GRADO", "COSTO TOTAL"};
        TableModel model = new DefaultTableModel(cabecera, modelo.listar().size());
        int i = 0;
        for (Alumno a : modelo.listar()) {
            model.setValueAt(a.getDni(), i, 0);
            model.setValueAt(a.getApe(), i, 1);
            model.setValueAt(a.getNom(), i, 2);
            model.setValueAt(a.getEdad(), i, 3);
            model.setValueAt(a.getSex(), i, 4);
            model.setValueAt(a.getSeccion(), i, 5);
            model.setValueAt(a.getNivel(), i, 6);
            model.setValueAt(a.getGrado(), i, 7);
            model.setValueAt(a.getTotal(), i, 8);
            i++;
        }
        vista.JtablaAlumno.setModel(model);
    }
}
