/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej16;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T5Ej16 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        
        try{
            System.out.println("Introduzca el nombre del alumno: ");
            alumno1.setNombre(entrada.nextLine());
            System.out.println("Introduzca la nota");
            alumno1.setNota(entrada.nextInt());
            
        }
        catch(Exception e){
           
        }
        
        
    }
    
}
