package Controlador;

import Modelo.ConsultasAlumno;
import Modelo.Alumno;
import Modelo.ConsultasNotas;
import Modelo.Notas;
import VistaAlumno.FormAlumno;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorNotasAlumno {

    private FormAlumno vista;
    private ConsultasNotas modeloN;
    private ConsultasAlumno modeloA;
    String dni;
    float acum;

    public ControladorNotasAlumno(FormAlumno vista, ConsultasNotas modeloN, ConsultasAlumno modeloA, String dni) {
        this.vista = vista;
        this.modeloN = modeloN;
        this.modeloA = modeloA;
        this.dni = dni;
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        MostrarDatos();
        
    }  

    public int tamaño() {
        int tam = 0;
        for (Notas n : modeloN.listar()) {
            for (Alumno a : modeloA.listar()) {
                if (dni.compareTo(a.getDni() + "") == 0) {
                    if (a.getApe().compareTo(n.getApe()) == 0 && a.getNom().compareTo(n.getNom()) == 0) {
                        tam++;
                    }
                }
            }
        }
        return tam;
    }
    int i;

    public void MostrarDatos() {
        Object[] cabecera = {"CURSO", "1ER BIMESTRE", "2DO BIMESTRE", "3ER BIMESTRE", "4TO BIMESTRE", "PROMEDIO FINAL"};
        TableModel model = new DefaultTableModel(cabecera, tamaño());
        i = 0;
        for (Notas n : modeloN.listar()) {
            for (Alumno a : modeloA.listar()) {
                if (dni.compareTo(a.getDni() + "") == 0) {
                    vista.txtApe.setText(a.getApe());
                    vista.txtNom.setText(a.getNom());
                    vista.txtNivel.setText(a.getNivel());
                    vista.txtGrado.setText(a.getGrado());
                    vista.txtSeccion.setText(a.getSeccion());
                    if (a.getApe().compareTo(n.getApe()) == 0 && a.getNom().compareTo(n.getNom()) == 0) {
                        model.setValueAt(n.getCur(), i, 0);
                        model.setValueAt(n.getPrimero(), i, 1);
                        model.setValueAt(n.getSegundo(), i, 2);
                        model.setValueAt(n.getTercero(), i, 3);
                        model.setValueAt(n.getCuarto(), i, 4);
                        model.setValueAt(n.getPromedio(), i, 5);
                        acum += n.getPromedio();
                        i++;
                    }
                }
            }
        }
        vista.JTablaNotasAlum.setModel(model);
    }
}
