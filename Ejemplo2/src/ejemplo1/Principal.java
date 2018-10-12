/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

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
        
        Precio p = new Precio();//Creamos el objeto 'p' de tipo Precio
        p.euros = 10.1;//Asignamos un valor al atributo euros.
        
        System.out.println(p.euros);//Presenta en pantalla el valor del atributo euros.
    }
}
