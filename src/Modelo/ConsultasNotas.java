package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasNotas extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Notas notas) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("insert into notas (ref_alumno_ape,ref_alumno_nom,ref_curso,ref_nivel,ref_grado,ref_seccion,1er_bimestre,2do_bimestre,3er_bimestre,4to_bimestre,promedio,id_notas) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, notas.getApe());
            ps.setString(2, notas.getNom());
            ps.setString(3, notas.getCur());
            ps.setString(4, notas.getNiv());
            ps.setString(5, notas.getGra());
            ps.setString(6, notas.getSec());
            ps.setFloat(7, notas.getPrimero());
            ps.setFloat(8, notas.getSegundo());
            ps.setFloat(9, notas.getTercero());
            ps.setFloat(10, notas.getCuarto());
            ps.setFloat(11, notas.getPromedio());
            ps.setInt(12, notas.getIdnota());
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
    
    public boolean modificar(Notas notas) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update notas set ref_alumno_ape=?,ref_alumno_nom=?,ref_curso=?,ref_nivel=?,ref_grado=?,ref_seccion=?,1er_bimestre=?,2do_bimestre=?,3er_bimestre=?,4to_bimestre=?, promedio=? where id_notas=?");    
            ps.setString(1, notas.getApe());
            ps.setString(2, notas.getNom());
            ps.setString(3, notas.getCur());
            ps.setString(4, notas.getNiv());
            ps.setString(5, notas.getGra());
            ps.setString(6, notas.getSec());
            ps.setFloat(7, notas.getPrimero());
            ps.setFloat(8, notas.getSegundo());
            ps.setFloat(9, notas.getTercero());
            ps.setFloat(10, notas.getCuarto());
            ps.setFloat(11, notas.getPromedio());
            ps.setInt(12, notas.getIdnota());
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
    public boolean eliminar(Notas notas) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from notas where id_notas=?");
            ps.setInt(1, notas.getIdnota());
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
    ArrayList<Notas> pac;
    public ArrayList<Notas> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM notas ");
            while(rs.next()){
                pac.add(new Notas(rs.getInt("id_notas"),rs.getString("ref_alumno_ape"),rs.getString("ref_alumno_nom"),rs.getString("ref_curso"),
                        rs.getString("ref_nivel"),rs.getString("ref_grado"),rs.getString("ref_seccion"),
                        rs.getFloat("1er_bimestre"),rs.getFloat("2do_bimestre"),rs.getFloat("3er_bimestre"),rs.getFloat("4to_bimestre"),rs.getFloat("promedio")));
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
