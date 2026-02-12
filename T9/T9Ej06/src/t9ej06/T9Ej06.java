/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej06;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T9Ej06 {

    /**
     * @param args the command line arguments
     */
    public static String introducirDni(){
        Scanner entrada = new Scanner(System.in);
        String dni ="";
        
        do{
            System.out.println("Introduce tu DNI:");
            dni = entrada.nextLine().toUpperCase();
            
            if(dni.length() != 9){
                System.err.println("Dato incorrecto.");
            }
            
        }while(dni.length() != 9);
        
        return dni;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
