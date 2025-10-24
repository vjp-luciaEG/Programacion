/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej1 {

    /**
     * @param args the command line arguments
     */
    
    public static void metodoPositivoYNegativo(int numero){
        if(numero>0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //POSITIVO O NEGATIVO
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        int numero = entrada.nextInt();
        
        metodoPositivoYNegativo(numero);
        
        
    }
    
}
