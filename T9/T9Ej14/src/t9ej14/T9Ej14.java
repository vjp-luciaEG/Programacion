/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T9Ej14 {

    /**
     * @param args the command line arguments
     */
    
    public static String introducirString() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        String texto = entrada.nextLine();

        return texto;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       StringBuffer cadenaMutable = new StringBuffer("Hola mundo");
       
       //Metodos StringBuffer
        System.out.println(cadenaMutable.append(", que tal."));
        System.out.println(cadenaMutable.delete(4,cadenaMutable.length()));
        System.out.println(cadenaMutable.insert(cadenaMutable.length(), " lucia"));
        String nombre = introducirString();
        System.out.println(cadenaMutable.replace(5, cadenaMutable.length(), nombre));
        System.out.println("Longitud de la cadena: " + cadenaMutable.length());
        System.out.println("Capacidad de la cadena: " + cadenaMutable.capacity());
        System.out.println(cadenaMutable.toString());
        
    }
    
}
