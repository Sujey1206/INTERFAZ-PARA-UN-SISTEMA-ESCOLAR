package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasAlumno extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(Alumno alumno) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("insert into alumno (dni,apellido,nombre,edad,sexo,seccion,nivel,grado,total) values (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApe());
            ps.setString(3, alumno.getNom());
            ps.setInt(4, alumno.getEdad());
            ps.setString(5, alumno.getSex());
            ps.setString(6, alumno.getSeccion());
            ps.setString(7, alumno.getNivel());
            ps.setString(8, alumno.getGrado());
            ps.setFloat(9, alumno.getTotal());
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

    public boolean modificar(Alumno alumno) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update alumno set apellido=?,nombre=?,edad=?,sexo=?,seccion=?,nivel=?,grado=?,total=? where dni=?");
            ps.setString(1, alumno.getApe());
            ps.setString(2, alumno.getNom());
            ps.setInt(3, alumno.getEdad());
            ps.setString(4, alumno.getSex());
            ps.setString(5, alumno.getSeccion());
            ps.setString(6, alumno.getNivel());
            ps.setString(7, alumno.getGrado());
            ps.setFloat(8, alumno.getTotal());
            ps.setInt(9, alumno.getDni());
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

    public boolean eliminar(Alumno alumno) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from alumno where dni=?");
            ps.setInt(1, alumno.getDni());
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
    ArrayList<Alumno> pac;
    public ArrayList<Alumno> listar(){
        pac = new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM alumno ");
            while(rs.next()){
                pac.add(new Alumno(rs.getString("apellido"),rs.getString("nombre"),
                        rs.getString("sexo"),rs.getString("nivel"),rs.getString("seccion"),rs.getInt("dni"),
                        rs.getInt("edad"),rs.getString("grado"),rs.getFloat("total")));
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return pac;
    }
}
