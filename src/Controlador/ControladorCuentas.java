package Controlador;
import Inicio.LoginAlumno;
import Inicio.LoginDocente;
import Modelo.*;

public class ControladorCuentas{

    private Cuentas cuentas;
    private LoginDocente vistaD;
    private LoginAlumno vistaA;
    private ConsultasAlumno modeloA;
    private ConsultasDocente modeloD;
    private ConsultasCuentas modeloCD;
    private ConsultasCuentasA modeloCA;

    String correo;

    public ControladorCuentas(LoginDocente vista, Cuentas cuentas, ConsultasCuentas modeloCD, ConsultasDocente modeloD) {
        this.vistaD = vista;
        this.cuentas = cuentas;
        this.modeloCD = modeloCD;
        this.modeloD = modeloD;
    }
    public ControladorCuentas(LoginAlumno vista, Cuentas cuentas, ConsultasCuentasA modeloCA, ConsultasAlumno modeloA) {
        this.vistaA = vista;
        this.cuentas = cuentas;
        this.modeloCA = modeloCA;
        this.modeloA = modeloA;
    }

    public void iniciarD() {
        vistaD.setLocationRelativeTo(null);
        insertarRelaciónD();
    }
    public void iniciarA() {
        vistaA.setLocationRelativeTo(null);
        insertarRelaciónA();
    }

    public void insertarRelaciónD() {
        for (Docente d : modeloD.listar()) {
            int cont = 0;
            cuentas.setUsuario(d.getCorreo());
            cuentas.setContraseña(d.getDni());
            for (Cuentas n : modeloCD.listar()) {
                if (n.getUsuario().compareTo(d.getCorreo()) == 0) {
                    cont = 1;
                }
            }
            if (cont != 1) {
                modeloCD.insertar(cuentas);
                cont = 0;
            }
        }
        eliminarRelacionD();
    }
    public void insertarRelaciónA() {
        for (Alumno a : modeloA.listar()) {
            int cont = 0;
            cuentas.setUsuario(a.getDni()+"");
            cuentas.setContraseña(a.getDni());
            for (Cuentas n : modeloCA.listar()) {
                if (n.getUsuario().compareTo(a.getDni()+"") == 0) {
                    cont = 1;
                }
            }
            if (cont != 1) {
                modeloCA.insertar(cuentas);
                cont = 0;
            }
        }
        eliminarRelacionA();
    }
    
    public void eliminarRelacionD() {
        int cont;
        for (Cuentas n : modeloCD.listar()) {
            cont = 0;
            for (Docente d : modeloD.listar()) {
                if (d.getCorreo().compareTo(n.getUsuario()) == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                modeloCD.eliminar(n);
                cont = 0;
            }
        }
    }
    public void eliminarRelacionA() {
        int cont;
        for (Cuentas n : modeloCA.listar()) {
            cont = 0;
            for (Alumno a : modeloA.listar()) {
                if (n.getUsuario().compareTo(a.getDni()+"") == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                modeloCA.eliminar(n);
                cont = 0;
            }
        }
    }
}
