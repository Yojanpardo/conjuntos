/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author yojan
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author yojan
 */
public class conectar {
    java.sql.Connection con;
    java.sql.Statement st;
    java.sql.ResultSet rs;
    
    public conectar(){
        try{
            try{
                Class.forName("org.postgresql.Driver");
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error cargando el Driver", "Error fatal", JOptionPane.ERROR_MESSAGE);
            }
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/conjunto","yojan","POLLOFRITO1030");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos", "Error fatal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean validar(String sql){
        java.sql.ResultSet hoja_resultado=null;
        try{
            st=con.createStatement();
            hoja_resultado=st.executeQuery(sql);
            if(hoja_resultado.next()){
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex,"Error fatal",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}