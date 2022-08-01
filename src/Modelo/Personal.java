package Modelo;
public class Personal {
    private int dni,edad;
    private String ape, nom, sex,tipo,Estado,tele,pago,correo;

    public Personal(int dni, int edad, String ape, String nom, String sex, String tipo, String Estado, String tele, String pago, String correo) {
        this.dni = dni;
        this.edad = edad;
        this.ape = ape;
        this.nom = nom;
        this.sex = sex;
        this.tipo = tipo;
        this.Estado = Estado;
        this.tele = tele;
        this.pago = pago;
        this.correo = correo;
    }

    public Personal() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
