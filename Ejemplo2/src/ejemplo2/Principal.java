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
public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Precio p = new Precio();//Creamos el objeto 'p' de tipo Precio
        p.agregar(20.2);//Asignamos un valor al atributo euros.
        
        System.out.println(p.obtener());//Presenta en pantalla el valor del atributo euros.
    }
    
}
