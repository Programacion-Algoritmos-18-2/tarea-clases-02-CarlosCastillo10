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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Equipo e = new Equipo();//Creamos el objeto 'e' de tipo Equipo
        
        //Presentamos en pantalla lo que retorna cada uno de los metodos.
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n\n", 
                e.obtener_nombre(), e.obtener_num_jugadores(), e.obtener_ciudad());

        Equipo e2 = new Equipo("Liga de Loja");
        
        //Llamamos a cada uno de los metodos.
        e2.agregar_num_jugadores(20);//Creamos el objeto 'e2' de tipo Equipo
        e2.agregar_ciudad("Loja");
        
        //Presentamos en pantalla lo que retorna cada uno de los metodos.
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n\n", e2.
                obtener_nombre(), e2.obtener_num_jugadores(), e2.obtener_ciudad());
        
        Equipo e3 = new Equipo("Deportivo Cuenca",25);//Creamos el objeto 'e3' de tipo Equipo
        
        e3.agregar_ciudad("Cuenca");//Llamamos al metodo.
        
        //Presentamos en pantalla lo que retorna cada uno de los metodos.
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n\n", e3.
                obtener_nombre(), e3.obtener_num_jugadores(), e3.obtener_ciudad());
        
        Equipo e4 = new Equipo("Mushuc Runa",26,"Ambato");//Creamos el objeto 'e4' de tipo Equipo
        
        //Presentamos en pantalla lo que retorna cada uno de los metodos.
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n\n", e4.
                obtener_nombre(), e4.obtener_num_jugadores(), e4.obtener_ciudad());
    }
    
}
