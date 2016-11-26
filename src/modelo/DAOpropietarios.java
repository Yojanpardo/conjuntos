package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author yojan
 */
public class DAOpropietarios extends propietarios{

    controlador.conectar conexion;
    Connection reg=conexion.conectar();
    public DAOpropietarios() {
        conexion = new controlador.conectar();
    }
    String ingresar = "INSERT INTO propietarios(cedula,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,correo) VALUES(?,?,?,?,?)";
    
    public Boolean registro() {
        try {
            
            /*String ingresar = "INSERT INTO propietarios(cedula,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,correo) "
                    + "VALUES('"+super.getCedula()+"','"+super.getPrimerNombre()+"','"+super.getsegundoNombre()+"',"
                    + "'"+super.getPrimerApellido()+"','"+super.getSegundoApellido()+"','"+super.getCorreo()+"')";
            
            return true;
            */
            PreparedStatement pst = reg.prepareStatement(ingresar);
            pst.setString(1, super.getCedula());
            pst.setString(2, super.getPrimerNombre());
            pst.setString(3, super.getsegundoNombre());
            pst.setString(4, super.getPrimerApellido());
            pst.setString(5, super.getSegundoApellido());
            pst.setString(6, super.getCorreo());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Datos almacenados con exito", " ", JOptionPane.PLAIN_MESSAGE);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error", " ", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex, "Error fatal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
