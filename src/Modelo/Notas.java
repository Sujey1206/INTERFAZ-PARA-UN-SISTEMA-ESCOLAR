package Modelo;
public class Notas {
    private int idnota;
    private String ape,nom,cur,niv,gra,sec;
    private float primero,segundo,tercero,cuarto,promedio;

    public Notas(int idnota, String ape, String nom, String cur, String niv, String gra, String sec, float primero, float segundo, float tercero, float cuarto, float promedio) {
        this.idnota = idnota;
        this.ape = ape;
        this.nom = nom;
        this.cur = cur;
        this.niv = niv;
        this.gra = gra;
        this.sec = sec;
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
        this.cuarto = cuarto;
        this.promedio = promedio;
    }
    
    public Notas(){   
    }    

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
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

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getNiv() {
        return niv;
    }

    public void setNiv(String niv) {
        this.niv = niv;
    }

    public String getGra() {
        return gra;
    }

    public void setGra(String gra) {
        this.gra = gra;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public float getPrimero() {
        return primero;
    }

    public void setPrimero(float primero) {
        this.primero = primero;
    }

    public float getSegundo() {
        return segundo;
    }

    public void setSegundo(float segundo) {
        this.segundo = segundo;
    }

    public float getTercero() {
        return tercero;
    }

    public void setTercero(float tercero) {
        this.tercero = tercero;
    }

    public float getCuarto() {
        return cuarto;
    }

    public void setCuarto(float cuarto) {
        this.cuarto = cuarto;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
    
}