/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej26 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean esPrimo(int numEntero){
        boolean esPrimo=true;
        int i=2;
        while(i<=numEntero/2 && esPrimo==true){
            if(numEntero%i==0){
                esPrimo=false;
            }
            i++;
        }
        return esPrimo;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //ES PRIMO
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numEntero = entrada.nextInt();
        
        boolean esPrimo = esPrimo(numEntero);
        if(esPrimo==true){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
    
}
