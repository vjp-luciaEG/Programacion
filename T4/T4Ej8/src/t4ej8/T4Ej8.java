/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej8;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej8 {
    /**
     * @param args the command line arguments
     */
    public static void calculoDinero(long dinero){
        long dinero2 = dinero; //Declaramos variable intermedia
      
        long billete50 = dinero2/50;
        dinero2 = dinero2 % 50;
        long billete20 = dinero2/20;
        dinero2 = dinero2 % 20;
        long billete10 = dinero2/10;
        dinero2 = dinero2 % 10;
        long moneda2 = dinero2/2;
        long moneda1 = dinero2 % 2;
        
        System.out.println(dinero + " Euros se descomponen en: ");
        
        if (billete50 > 0){
            System.out.println("Billetes de 50: " + billete50);
        }
        if (billete20 > 0){
            System.out.println("Billetes de 20: " + billete20);
        }
        if (billete10 > 0){
            System.out.println("Billetes de 10: " + billete10);
        }
        if (moneda2 > 0){
            System.out.println("Monedas de 2 Euros: " + moneda2);
        }
        if (moneda1 > 0){
            System.out.println("Monedas de 1 Euro: " + moneda1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //DINERO
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca cantidad de dinero: ");
        long dinero = entrada.nextLong();
        
        calculoDinero(dinero);
    }
    
}
