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
public class inmuebles {
    private String direccion;
    private int admon;
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setAdmon(int admon){
        this.admon=admon;
    }
    
    public int getAdmon(){
        return admon;
    }
}
