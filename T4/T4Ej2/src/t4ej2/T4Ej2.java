/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MULTIPLICAR O SUMAR
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca un segundo numero: ");
        int num2 = entrada.nextInt();
        
        if(num1>10){
            Calculo.multiplicar(num1, num2);
        }
        else{
            Calculo.sumar(num1, num2);
        }
        
    }
    
}
