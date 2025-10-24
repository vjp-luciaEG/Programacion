/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ej9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Fases {
    public static int primerDato(){
        int num1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduza el primer numero: ");
        num1 = entrada.nextInt();
        return num1;
    }
    public static int segundoDato(){
        int num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduza el segundo numero: ");
        num2 = entrada.nextInt();
        return num2;
    }
    public static int tercerDato(){
        int num3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduza el tercer numero: ");
        num3 = entrada.nextInt();
        return num3;
    }
    public static void elMenor(int num1, int num2, int num3){
        int x;
        if(num1<num2){
            x = num1;
            num1 = num2;
            num2 = x;            
        }
        if(num2<num3){
            x = num2;
            num2 = num3;
            num3 = x;
        }
        System.out.println("El numero menor de los introducidos es " + num3);
    }
    
}
