package Controlador;
import Modelo.ConsultasAlumno;
import Modelo.Alumno;
import Modelo.ConsultasDocente;
import Modelo.ConsultasNotas;
import Modelo.Docente;
import Modelo.Notas;
import VistaDocente.FormDocente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorNotas implements ActionListener {

    private Notas notas;
    private FormDocente vista;
    private ConsultasAlumno modeloA;
    private ConsultasDocente modeloD;
    private ConsultasNotas modeloN;

    String correo;

    public ControladorNotas(FormDocente vista, Notas notas, ConsultasNotas modeloN, ConsultasAlumno modeloA, ConsultasDocente modeloD, String correo) {
        this.vista = vista;
        this.notas = notas;
        this.modeloN = modeloN;
        this.modeloA = modeloA;
        this.modeloD = modeloD;
        this.correo = correo;
        vista.btnModificar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        insertarRelación();
        vista.txtIdnota.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnLimpiar) {
            limpiar();
        }
        if (ae.getSource() == vista.btnBuscar) {
            Object[] cabecera = {"  ", "APELLIDOS", "NOMBRES", "CURSO", "NIVEL", "GRADO", "SECCION", "1ER BIMESTRE", "2DO BIMESTRE", "3ER BIMESTRE", "4TO BIMESTRE", "PROMEDIO FINAL"};
            TableModel model = new DefaultTableModel(cabecera, tamañoB());
            int i = 0;
            for (Notas n : modeloN.listar()) {
                if (vista.txtBuscar.getText().compareTo(n.getApe()) == 0 || vista.txtBuscar.getText().compareTo(n.getNom()) == 0
                        || vista.txtBuscar.getText().compareTo(n.getCur()) == 0 || vista.txtBuscar.getText().compareTo(n.getNiv()) == 0
                        || vista.txtBuscar.getText().compareTo(n.getGra()) == 0 || vista.txtBuscar.getText().compareTo(n.getSec()) == 0) {
                    model.setValueAt(n.getIdnota(), i, 0);
                    model.setValueAt(n.getApe(), i, 1);
                    model.setValueAt(n.getNom(), i, 2);
                    model.setValueAt(n.getCur(), i, 3);
                    model.setValueAt(n.getNiv(), i, 4);
                    model.setValueAt(n.getGra(), i, 5);
                    model.setValueAt(n.getSec(), i, 6);
                    model.setValueAt(n.getPrimero(), i, 7);
                    model.setValueAt(n.getSegundo(), i, 8);
                    model.setValueAt(n.getTercero(), i, 9);
                    model.setValueAt(n.getCuarto(), i, 10);
                    model.setValueAt(n.getPromedio(), i, 11);
                    i++;
                }
            }
            vista.JTablaNota.setModel(model);
            if (vista.txtBuscar.getText().isEmpty()) {
                MostrarDatos();
            }
        }
        if (ae.getSource() == vista.btnModificar) {
            try {
                notas.setIdnota(Integer.parseInt(vista.txtIdnota.getText()));
                notas.setApe(vista.lblApe.getText());
                notas.setNom(vista.lblNom.getText());
                notas.setCur(vista.lblCurso.getText());
                notas.setNiv(vista.lblNivel.getText());
                notas.setGra(vista.lblGrado.getText());
                notas.setSec(vista.lblSec.getText());
                notas.setPrimero(vista.notas.getPrimero());
                notas.setSegundo(vista.notas.getSegundo());
                notas.setTercero(vista.notas.getTercero());
                notas.setCuarto(vista.notas.getCuarto());
                notas.setPromedio(vista.notas.getPromedio());
                if (vista.cbPeriodo.getSelectedItem().toString().compareTo("1er Bimestre") == 0) {
                    notas.setPrimero(promBimestral());
                } else if (vista.cbPeriodo.getSelectedItem().toString().compareTo("2do Bimestre") == 0) {
                    notas.setSegundo(promBimestral());
                } else if (vista.cbPeriodo.getSelectedItem().toString().compareTo("3er Bimestre") == 0) {
                    notas.setTercero(promBimestral());
                } else if (vista.cbPeriodo.getSelectedItem().toString().compareTo("4to Bimestre") == 0) {
                    notas.setCuarto(promBimestral());
                }
                notas.setPromedio(promFinal());
                if (modeloN.modificar(notas)) {
                    JOptionPane.showMessageDialog(null, "Nota registrada correctamente", "AVISO", 1);
                    MostrarDatos();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro", "ERROR", 0);
                    limpiar();
                }
            } catch (NumberFormatException a) {
                if (vista.txtIdnota.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione un item de la tabla para actualizar");
                } else {
                    JOptionPane.showMessageDialog(null, "No ingrese letras, seleccione un item de la tabla para actualizar");
                }
                vista.txtIdnota.setText("");
            }
        }
    }

    public float promBimestral() {
        float prom = 0;
        InterfazAlumno pro= (a,b,c,d)->(((a+b+c+2*d)/5));
        if (vista.lblNivel.getText().compareTo("Inicial") == 0) {
            prom = pro.funcional(Integer.parseInt(vista.cbEBimes.getSelectedItem().toString()), Integer.parseInt(vista.cbEMensual.getSelectedItem().toString()),
                    Integer.parseInt(vista.cbPmTareas.getSelectedItem().toString()), Integer.parseInt(vista.cbPmManu.getSelectedItem().toString()));
        } else if (vista.lblNivel.getText().compareTo("Primaria") == 0) {
            prom = pro.funcional(Integer.parseInt(vista.cbEBimes.getSelectedItem().toString()), Integer.parseInt(vista.cbEMensual.getSelectedItem().toString()),
                    Integer.parseInt(vista.cbPmTareas.getSelectedItem().toString()), Integer.parseInt(vista.cbPmTaller.getSelectedItem().toString()));
        } else if (vista.lblNivel.getText().compareTo("Secundaria") == 0) {
            prom = pro.funcional(Integer.parseInt(vista.cbEBimes.getSelectedItem().toString()), Integer.parseInt(vista.cbEMensual.getSelectedItem().toString()),
                    Integer.parseInt(vista.cbPmTareas.getSelectedItem().toString()), Integer.parseInt(vista.cbPmSim.getSelectedItem().toString()));
        }
        return prom;
    }

    public float promFinal() {
       InterfazAlumno prom= (a,b,c,d)->(((a+b+c+d)/4));
       return prom.funcional(notas.getPrimero(), notas.getSegundo(), notas.getTercero(), notas.getCuarto());
    }

    public void limpiar() {
        vista.txtIdnota.setText("");
        vista.lblApe.setText("");
        vista.lblNom.setText("");
        vista.lblCurso.setText("");
        vista.lblNivel.setText("");
        vista.lblGrado.setText("");
        vista.lblSec.setText("");
        vista.cbEMensual.setSelectedIndex(0);
        vista.cbEBimes.setSelectedIndex(0);
        vista.cbPeriodo.setSelectedIndex(0);
        vista.cbPmManu.setSelectedIndex(0);
        vista.cbPmSim.setSelectedIndex(0);
        vista.cbPmTaller.setSelectedIndex(0);
        vista.cbPmTareas.setSelectedIndex(0);
    }

    public void insertarRelación() {
        for (Docente d : modeloD.listar()) {
            if (correo.compareTo(d.getCorreo()) == 0) {
                for (Alumno a : modeloA.listar()) {
                    if (d.getNivel().compareTo(a.getNivel()) == 0 && d.getGrado().compareTo(a.getGrado()) == 0 && d.getSeccion().compareTo(a.getSeccion()) == 0) {
                        int cont = 0;
                        notas.setApe(a.getApe());
                        notas.setNom(a.getNom());
                        notas.setCur(d.getCurso());
                        notas.setNiv(a.getNivel());
                        notas.setGra(a.getGrado());
                        notas.setSec(a.getSeccion());
                        for (Notas n : modeloN.listar()) {
                            if (n.getApe().compareTo(a.getApe()) == 0 && n.getNom().compareTo(a.getNom()) == 0 && n.getCur().compareTo(d.getCurso()) == 0
                                    && n.getNiv().compareTo(a.getNivel()) == 0 && n.getGra().compareTo(a.getGrado()) == 0 && n.getSec().compareTo(a.getSeccion()) == 0) {
                                cont = 1;
                                notas.setPrimero(n.getPrimero());
                                notas.setSegundo(n.getSegundo());
                                notas.setTercero(n.getTercero());
                                notas.setCuarto(n.getCuarto());
                                notas.setPromedio(n.getPromedio());
                            }
                        }
                        if (cont != 1) {
                            notas.setPrimero(0);
                            notas.setSegundo(0);
                            notas.setTercero(0);
                            notas.setCuarto(0);
                            notas.setPromedio(0);
                            modeloN.insertar(notas);
                            cont = 0;

                        }
                    }
                }
            }
        }
        eliminarRelacion();
        MostrarDatos();
    }

    public void eliminarRelacion() {
        int cont;
        for (Notas n : modeloN.listar()) {
            cont = 0;
            for (Alumno a : modeloA.listar()) {
                if (a.getApe().compareTo(n.getApe()) == 0 && a.getNom().compareTo(n.getNom()) == 0
                        && n.getNiv().compareTo(a.getNivel()) == 0 && n.getGra().compareTo(a.getGrado()) == 0
                        && n.getSec().compareTo(a.getSeccion()) == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                modeloN.eliminar(n);
                cont = 0;
            }
        }
        for (Notas n : modeloN.listar()) {
            cont = 0;
            for (Docente d : modeloD.listar()) {
                if (d.getCurso().compareTo(n.getCur()) == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                modeloN.eliminar(n);
                cont = 0;
            }
        }
    }

    public int tamañoB() {
        int tam = 0;
        for (Notas n : modeloN.listar()) {
            if (vista.txtBuscar.getText().compareTo(n.getApe()) == 0 || vista.txtBuscar.getText().compareTo(n.getNom()) == 0
                    || vista.txtBuscar.getText().compareTo(n.getCur()) == 0 || vista.txtBuscar.getText().compareTo(n.getNiv()) == 0
                    || vista.txtBuscar.getText().compareTo(n.getGra()) == 0 || vista.txtBuscar.getText().compareTo(n.getSec()) == 0) {
                tam++;
            }
        }
        return tam;
    }

    public int tamaño() {
        int tam = 0;
        for (Notas n : modeloN.listar()) {
            for (Docente d : modeloD.listar()) {
                if (correo.compareTo(d.getCorreo()) == 0) {
                    if (n.getCur().compareTo(d.getCurso()) == 0 && n.getNiv().compareTo(d.getNivel()) == 0
                            && n.getGra().compareTo(d.getGrado()) == 0 && n.getSec().compareTo(d.getSeccion()) == 0) {
                        tam++;
                    }
                }
            }
        }
        return tam;
    }

    public void MostrarDatos() {
        Object[] cabecera = {"  ", "APELLIDOS", "NOMBRES", "CURSO", "NIVEL", "GRADO", "SECCION", "1ER BIMESTRE", "2DO BIMESTRE", "3ER BIMESTRE", "4TO BIMESTRE", "PROMEDIO FINAL"};
        TableModel model = new DefaultTableModel(cabecera, tamaño());
        int i = 0;
        for (Notas n : modeloN.listar()) {
            for (Docente d : modeloD.listar()) {
                if (correo.compareTo(d.getCorreo()) == 0) {
                    if (n.getCur().compareTo(d.getCurso()) == 0 && n.getNiv().compareTo(d.getNivel()) == 0
                            && n.getGra().compareTo(d.getGrado()) == 0 && n.getSec().compareTo(d.getSeccion()) == 0) {
                        model.setValueAt(n.getIdnota(), i, 0);
                        model.setValueAt(n.getApe(), i, 1);
                        model.setValueAt(n.getNom(), i, 2);
                        model.setValueAt(n.getCur(), i, 3);
                        model.setValueAt(n.getNiv(), i, 4);
                        model.setValueAt(n.getGra(), i, 5);
                        model.setValueAt(n.getSec(), i, 6);
                        model.setValueAt(n.getPrimero(), i, 7);
                        model.setValueAt(n.getSegundo(), i, 8);
                        model.setValueAt(n.getTercero(), i, 9);
                        model.setValueAt(n.getCuarto(), i, 10);
                        model.setValueAt(n.getPromedio(), i, 11);
                        i++;
                    }
                }
            }
        }
        vista.JTablaNota.setModel(model);
    }
}
