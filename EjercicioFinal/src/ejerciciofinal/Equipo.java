/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author carlos
 */
public class Equipo {
    
    //Variables globales privadas.
    private String nombre;
    private int num_jugadores;
    private String ciudad;
    
    //Metodo que asigna valor al atributo 'nombre'
    public void agregar_nombre(String nom){
        nombre = nom;
      
    }
    
        //Metodo que asigna valor al atributo 'num_jugadores'
    public void agregar_num_jugadores(int n_jugadores){
        num_jugadores = n_jugadores;
    }
    
        //Metodo que asigna valor al atributo 'ciudad'
    public void agregar_ciudad(String c){
        ciudad = c;
    }
    
        //Metodo que permite obtener el valor al atributo 'nombre'
    public String obtener_nombre(){
        
        return nombre;
    }
    
    //Metodo que permite obtener el valor al atributo 'num_jugadores'
    public int obtener_num_jugadores(){
        
        return num_jugadores;
    }
    
    //Metodo que permite obtener el valor al atributo 'ciudad'
    public String obtener_ciudad(){
        
        return ciudad;
    }
    
    
    public Equipo(){//Constructor con valores por defecto
        
        agregar_nombre("Barcelona");
        agregar_num_jugadores(24);
        agregar_ciudad("Guayaquil");
    }
    
    public Equipo(String nom){//Constructor que recibe el nombre como parametro.
        
        agregar_nombre(nom);
        
    }
    
    //Constructor que recibe el nombre y numero de jugadores como parametro
    public Equipo(String nom, int n_jugadores){
        
        agregar_nombre(nom);
        agregar_num_jugadores(n_jugadores);
        
    }
    
    //Constructor que recibe el nombre, numero de jugadores y ciudad como parametro
    public Equipo(String nom, int n_jugadores, String c){
        
        agregar_nombre(nom);
        agregar_num_jugadores(n_jugadores);
        agregar_ciudad(c);
    }
    
}
