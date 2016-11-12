/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author yojan
 */
public class DAOusuarios extends usuarios{
    
    controlador.conectar conexion;
    
    public DAOusuarios() {
        conexion=new controlador.conectar();
    }
    
    public boolean valide(){
        String SQL="SELECT * FROM usuarios WHERE nombre='"+super.getUsuario()+"'AND pass='"+super.getPass()+"'";
        if(conexion.validar(SQL)==false){
            return false;
        }else{
            return true;
        }
    }
    
}
