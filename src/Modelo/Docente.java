
package Modelo;

public class Docente {
    private int iddoc,dni,edad;
    private String ape, nom, sex,nivel,seccion,grado,curso,correo;

    public Docente(int iddoc, int dni, int edad, String ape, String nom, String sex, String nivel, String seccion, String grado, String curso, String correo) {
        this.iddoc = iddoc;
        this.dni = dni;
        this.edad = edad;
        this.ape = ape;
        this.nom = nom;
        this.sex = sex;
        this.nivel = nivel;
        this.seccion = seccion;
        this.grado = grado;
        this.curso = curso;
        this.correo = correo;
    }

    public Docente() {
    }

    public int getIddoc() {
        return iddoc;
    }

    public void setIddoc(int iddoc) {
        this.iddoc = iddoc;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }




    
}
