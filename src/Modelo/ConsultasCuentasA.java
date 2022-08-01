package Modelo;
import Conexión.Conexion;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasCuentasA extends Conexion {
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Cuentas cuentas) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("insert into cuentasa (usuarioA,contraseñaA,idcuentaA) values (?,?,?)");
            ps.setString(1, cuentas.getUsuario());
            ps.setInt(2, cuentas.getContraseña());
            ps.setInt(3, cuentas.getIdcuenta());
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
    
    public boolean modificar(Cuentas cuentas) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("update cuentasa set usuarioA=?,contraseñaA=? where idcuentaA=?");    
            ps.setString(1, cuentas.getUsuario());
            ps.setInt(2, cuentas.getContraseña());
            ps.setInt(3, cuentas.getIdcuenta());
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
    public boolean eliminar(Cuentas cuentas) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("delete from cuentasa where idcuentaA=?");
            ps.setInt(1, cuentas.getIdcuenta());
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
    ArrayList<Cuentas> pac;
    public ArrayList<Cuentas> listar() {
        pac= new ArrayList<>();
        Connection conexion = getConnection();
        try {
            Statement leer = conexion.createStatement();
            ResultSet rs = leer.executeQuery("SELECT * FROM cuentasa ");
            while(rs.next()){
                pac.add(new Cuentas(rs.getInt("idcuentaA"),rs.getInt("contraseñaA"),rs.getString("usuarioA")));
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
