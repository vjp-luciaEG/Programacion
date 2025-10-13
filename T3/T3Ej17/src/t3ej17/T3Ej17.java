/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej17;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class T3Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //RAIZ CUADRADA DE UN NUMERO
        
        Scanner entrada = new Scanner(System.in);
        double i = 0;
        do{
            System.out.println("Introduzca un número para calcular su raiz cuadrada: "); 
            i = entrada.nextDouble();
                if(i>=0){
                    double raiz = Math.sqrt(i);
                    System.out.println("La raiz cuadrada de " + i + " es " + raiz);
                }
                else{
                    System.err.println("Error");
                }
        } while(i<0);
        
    }
    
}
