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
public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Precio p = new Precio();//Creamos el objeto 'p' de tipo Precip
        Precio m = new Precio(25.9);//Creamos el objeto m de tipo precio y hacemos referencia a un constructor.        
        
        //Presentamos en pantalla lo que retorna los metodos del objeto 'p'.
        System.out.println(p.obtener());
        System.out.println(m.obtener());
    }
    
}
