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
public class propietarios {
    private String primerNombre,segundoNombre,primerApellido,segundoApellido,cedula,correo;
    
    public void setPrimerNombre(String primerNombre){
        this.primerNombre=primerNombre;
    }
    
    public String getPrimerNombre(){
        return primerNombre;
    }
    
    public void setSegundoNombre(String segundoNombre){
        this.segundoNombre=segundoNombre;
    }
    
    public String getsegundoNombre(){
        return segundoNombre;
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido=primerApellido;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido=segundoApellido;
    }
    
    public String getSegundoApellido(){
        return segundoApellido;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    public String getCorreo(){
        return correo;
    }
}
