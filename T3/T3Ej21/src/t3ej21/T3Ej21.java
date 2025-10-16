/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DIVIDIR NUMEROS
        
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 0, c;
        try{
            System.out.println("Introduzca el dividendo: ");
            a = entrada.nextInt();
            System.out.println("Introduzca el divisor:");
            b = entrada.nextInt();
            c = a/b;
        }catch(ArithmeticException e){
            System.err.println("Error: Division entre 0");
            c = 0;
        }
         System.out.println(a + " / " + b + " = " + c);
    }
    
}
