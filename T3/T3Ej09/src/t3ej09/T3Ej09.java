/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej09;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class T3Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero:");
            byte a = entrada.nextByte();
        System.out.println("Introduzca el segundo numero:");
            byte b = entrada.nextByte();
        System.out.println("Introduzca el tercer numero:");
            byte c = entrada.nextByte();
        System.out.println("Introduzca el cuarto numero:");
            byte d = entrada.nextByte();
        
        byte x; //Variable intermedia
        
        if (a>b){
            x = a;
            a = b;
            b = x;
        }
        if(b>c){
            x = b;
            b = c;
            c = x;
        }
        if(c>d){
            x = c;
            c = d;
            d = x;
        }
        if(a>b){
            x = a;
            a = b;
            b = x;
        }
        if(b>c){
            x = b;
            b = c;
            c = x;
        }
        if(a>b){
            x = a;
            a = b;
            b = x;
        }
        
        System.out.println("El orden de los numeros introducidos es: " + a + " - " + b + " - " + c + " - " + d);
    } 
    
}
