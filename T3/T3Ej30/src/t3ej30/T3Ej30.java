/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej30;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //ADIVINA EL NUMERO #2
        
        Scanner entrada = new Scanner(System.in);
        int x = -1;
        double aleatorio = Math.floor((Math.random())*101);
        int intentos = 0;
        
        while(x!=aleatorio){
           
            try{
                System.out.println("Adivine el numero entre 0 y 100: ");
                x = entrada.nextInt();
            
                if(x<aleatorio){
                    System.out.println("El numero a adivinar es mayor que el introducido");
                }
                if(x>aleatorio){
                    System.out.println("El numero a adivinar es menor que el introducido");
                }
                intentos++;
            }
            catch(InputMismatchException e){
                System.err.println("Error");
                entrada.nextLine();
                intentos++;
            }
        } 
        
        System.out.println("Correcto \nCompletado en " + intentos + " intentos ");
    }
    
}
