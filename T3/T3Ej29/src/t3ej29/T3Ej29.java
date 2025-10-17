/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej29;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ADIVINA EL NUMERO
        
        Scanner entrada = new Scanner(System.in);
        double x = 0;
        double aleatorio = Math.floor((Math.random())*101+1);
        int intentos = 0;
        
        do{
            System.out.println("Adivine el numero entre 0 y 100: ");
            x = entrada.nextDouble();
            
            if(x<aleatorio){
                System.out.println("El numero a adivinar es mayor que el introducido");
            }
            if(x>aleatorio){
                System.out.println("El numero a adivinar es menor que el introducido");
            }
            intentos++;
        } while(x!=aleatorio);
        
        System.out.println("Correcto \nCompletado en " + intentos + " intentos ");
    }
    
}
