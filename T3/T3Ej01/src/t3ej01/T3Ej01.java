/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej01;
import java.util.Scanner;
/**
 *
 * @author Lucia
 */
public class T3Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Numero positivo o negativo
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        int num = entrada.nextInt(); //Declaramos la variable de entrada
        
            //Condicion
            if(num > 0){
                System.out.println("El numero es positivo.");
            } 
            else{
                System.out.println("El numero es negativo.");
            }
        
    }
    
}
