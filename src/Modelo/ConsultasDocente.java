package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasDocente extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(Docente docente) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("insert into docente (dnidoc,apellidodoc,nombredoc,edaddoc,cursodoc,sexodoc,secciondoc,niveldoc,gradodoc,correodoc) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, docente.getDni());
            ps.setString(2, docente.getApe());
            ps.setString(3, docente.getNom());
            ps.setInt(4, docente.getEdad());
            ps.setString(5, docente.getCurso());
            ps.setString(6, docente.getSex());
            ps.setString(7, docente.getSeccion());
            ps.setString(8, docente.getNivel());
            ps.setString(9, docente.getGrado());
            ps.setString(10, docente.getCorreo());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
                return false;
            }
        }
    }

    public boolean modificar(Docente docente) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update docente set dnidoc=?,apellidodoc=?,nombredoc=?,edaddoc=?,cursodoc=?,sexodoc=?,secciondoc=?,niveldoc=?,gradodoc=?,correodoc=? where iddoc=?");    
            ps.setInt(1, docente.getDni());
            ps.setString(2, docente.getApe());
            ps.setString(3, docente.getNom());
            ps.setInt(4, docente.getEdad());
            ps.setString(5, docente.getCurso());
            ps.setString(6, docente.getSex());
            ps.setString(7, docente.getSeccion());
            ps.setString(8, docente.getNivel());
            ps.setString(9, docente.getGrado());
            ps.setString(10, docente.getCorreo());
            ps.setInt(11, docente.getIddoc());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        }finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
                return false;
            }
        }
    }

    public boolean eliminar(Docente docente) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from docente where iddoc=?");
            ps.setInt(1, docente.getIddoc());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
                return false;
            }
        }
    }
    ArrayList<Docente> pac;
    public ArrayList<Docente> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM docente ");
            while(rs.next()){
                pac.add(new Docente(rs.getInt("iddoc"),rs.getInt("dnidoc"),rs.getInt("edaddoc"),rs.getString("apellidodoc"),
                        rs.getString("nombredoc"),rs.getString("sexodoc"),rs.getString("niveldoc"),
                        rs.getString("secciondoc"),rs.getString("gradodoc"),rs.getString("cursodoc"),rs.getString("correodoc")));
            }
            conexion.close();
        } catch (NullPointerException np) {
            System.err.println("Tabla vacia, " + np);
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        } 
        return pac;
    }
}
