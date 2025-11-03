/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej21 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        return num1;
    }
    
    public static int pedirSegundoNumero(int num1){
        Scanner entrada = new Scanner(System.in);
        int num2=0;
        do{
        System.out.println("Introduzca el ultimo numero: ");
        num2 = entrada.nextInt();
        if(num2<num1){
            System.err.println("Error, ultimo numero menor que el primero.");
        }
        } while(num2<num1);
        return num2;
    }
    public static void sumaNumerosPares(int num1, int num2){
        int suma=0;
        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                suma += i;
            }
        }
        System.out.println("La suma de los numeros pares entre " + num1 + " y " + num2 + " es " + suma);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //SUMA TOTAL DE NUMEROS PARES COMPRENDIDOS ENTRE DOS NUMEROS
        
        int num1=pedirNumero();
        int num2=pedirSegundoNumero(num1);
        sumaNumerosPares(num1, num2);
    }
    
}
