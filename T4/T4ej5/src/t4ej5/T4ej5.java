/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PAR O IMPAR
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        int num = entrada.nextInt();
        
        ej5.Calculo.parOImpar(num);
        
    }
    
}
