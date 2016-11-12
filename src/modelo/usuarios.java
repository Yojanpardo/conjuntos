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
public class usuarios {
    private String usuario,pass;
    
    public usuarios(){
        
    }
    public void setUsuario(String Usuario){
        this.usuario=Usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setPass(String Pass){
        this.pass=Pass;
    }
    public String getPass(){
        return pass;
    }
}
