/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

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
    
    //Constructores que llaman al metodo agregar.
    public Precio(){ //Constructor de que no recibe ningun parametro
        agregar(30.2);
    }
    
    
    public Precio(double y){ //Constructor que recibe un parametro.
        agregar(y);
    }
    
}
