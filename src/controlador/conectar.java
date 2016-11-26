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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author yojan
 */
public class conectar {
    Connection con;
    Statement st;
    ResultSet rs;
    
    public Connection conectar(){
        try{
            try{
                Class.forName("org.postgresql.Driver");
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error cargando el Driver", "Error fatal", JOptionPane.ERROR_MESSAGE);
            }
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/conjuntos","postgres","aeropuerto2522");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos "+ex, "Error fatal", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado jijijij");
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