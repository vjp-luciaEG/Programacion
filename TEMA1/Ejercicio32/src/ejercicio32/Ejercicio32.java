/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;

/**
 *
 * @author Lucia
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indique una cantidad de dinero:");
        int dinero = entrada.nextInt(); //Declaramos la variable de entrada
        
        int dinero2 = dinero; //Declaramos variable intermedia (temporal)
      
        int billete50 = dinero2/50;
        dinero2 = dinero2 % 50;
        int billete20 = dinero2/20;
        dinero2 = dinero2 % 20;
        int billete10 = dinero2/10;
        dinero2 = dinero2 % 10;
        int moneda2 = dinero2/2;
        int moneda1 = dinero2 % 2;
        
        System.out.println("La cantidad de " + dinero + " Euros, se descomponen en " + billete50 + " billetes de 50, " + billete20 + " billetes de 20, " + billete10 + " billetes de 10, " + moneda2 + " monedas de 2 Euros y " + moneda1 + " moneda de 1 Euro.");

    }
    
}
