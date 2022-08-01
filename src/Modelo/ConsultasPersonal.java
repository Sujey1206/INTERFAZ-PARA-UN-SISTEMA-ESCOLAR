package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasPersonal extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    public boolean insertar(Personal personal) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("insert into personal (dni,apellido,nombre,edad,sexo,tipo,estado,tele,correo,pago) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, personal.getDni());
            ps.setString(2, personal.getApe());
            ps.setString(3, personal.getNom());
            ps.setInt(4, personal.getEdad());
            ps.setString(5, personal.getSex());
            ps.setString(6, personal.getTipo());
            ps.setString(7, personal.getEstado());
            ps.setString(8, personal.getTele());
            ps.setString(9, personal.getCorreo());
            ps.setString(10, personal.getPago());
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

    public boolean modificar(Personal personal) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update personal set apellido=?,nombre=?,edad=?,sexo=?,tipo=?,estado=?,tele=?,correo=?,pago=? where dni=?");
            ps.setString(1, personal.getApe());
            ps.setString(2, personal.getNom());
            ps.setInt(3, personal.getEdad());
            ps.setString(4, personal.getSex());
            ps.setString(5, personal.getTipo());
            ps.setString(6, personal.getEstado());
            ps.setString(7, personal.getTele());
            ps.setString(8, personal.getCorreo());
            ps.setString(9, personal.getPago());
            ps.setInt(10, personal.getDni());
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

    public boolean eliminar(Personal personal) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from personal where dni=?");
            ps.setInt(1, personal.getDni());
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
    ArrayList<Personal> pac;
    public ArrayList<Personal> listar() {
        pac = new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM personal ");
            while(rs.next()){
                pac.add(new Personal(rs.getInt("dni"),rs.getInt("edad"),rs.getString("apellido"),rs.getString("nombre"),
                        rs.getString("sexo"),rs.getString("tipo"),rs.getString("estado"),
                        rs.getString("Tele"),rs.getString("Pago"),rs.getString("Correo")));
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return pac;
    }
}
