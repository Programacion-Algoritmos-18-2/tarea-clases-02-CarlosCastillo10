/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author carlos
 */
public class Precio {
    
    private double euros;//Variable privada.
    
    //Metodo que permite retornar el valor que contiene la variable 'euros'.
    public double obtener(){
        
        return euros;
    }
    
    //Metodo que permite asignarle un valor a la variable 'euros'.
    public void agregar(double x){
        euros = x;
    }
    
}
