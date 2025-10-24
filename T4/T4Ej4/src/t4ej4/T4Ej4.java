/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EL MENOR
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();
        
        Menor.elMenor(num1, num2, num3);
    }
    
}
