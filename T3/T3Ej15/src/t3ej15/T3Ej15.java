/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TABLA DE MULTIPLICAR
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: "); int num = entrada.nextInt();
        
        int i, resultado;
        
        for (i=0;i<=10;i++){
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
            
        }
    }
    
}
