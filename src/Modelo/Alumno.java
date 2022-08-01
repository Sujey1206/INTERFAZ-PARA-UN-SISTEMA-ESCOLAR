package Modelo;
public class Alumno {
    private int dni,edad;
    private String ape, nom, sex,nivel,seccion,grado;
    private float total;

    public Alumno(String ape, String nom, String sex, String nivel, String seccion, int dni, int edad, String grado, float total) {
        this.ape = ape;
        this.nom = nom;
        this.sex = sex;
        this.nivel = nivel;
        this.seccion = seccion;
        this.dni = dni;
        this.edad = edad;
        this.grado = grado;
        this.total = total;
    }

    public Alumno() {
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
