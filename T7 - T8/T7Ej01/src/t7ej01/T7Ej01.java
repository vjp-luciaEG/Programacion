/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej01 {

    /**
     * @param args the command line arguments
     */
    
    public static void rellenarVector(int [] vector){
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i < vector.length; i++){
            System.out.println("Introduzca el valor de la posicion " + (i+1) + ":");
            vector[i]= entrada.nextInt();
        }
    }
    
    public static void mostrarVector(int [] vector){
        for(int i=0; i < vector.length; i++){
            if(i%2==0){
                System.out.println("El valor de la posicion " + (i+1) + " es igual a " + vector[i]);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        
    }
    
}
