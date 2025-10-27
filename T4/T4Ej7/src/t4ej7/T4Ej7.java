/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void menorAMayor(int num1, int num2, int num3, int num4){
        int varIntermedia;
        while(num1>num2 || num2>num3 || num3>num4){
            if(num1>num2){
                varIntermedia=num1;
                num1=num2;
                num2=varIntermedia;
            }
            if(num2>num3){
                varIntermedia=num2;
                num2=num3;
                num3=varIntermedia;
            }
            if(num3>num4){
                varIntermedia=num3;
                num3=num4;
                num4=varIntermedia;
            }
        }
        System.out.println("El orden de los numeros introducidos es: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //DE MENOR A MAYOR
        
        Scanner entrada = new Scanner(System.in); //Entradas de datos
        
        System.out.println("Introduzca el primero numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        int num3 = entrada.nextInt();
        System.out.println("Introduzca el cuarto numero: ");
        int num4 = entrada.nextInt();
        
        menorAMayor(num1, num2, num3, num4); //Llamamos al método
        
    }
    
}
