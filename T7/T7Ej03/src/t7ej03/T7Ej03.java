/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej03;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej03 {

    /**
     * @param args the command line arguments
     */
    
    public static int elegirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        do{
            System.out.println("Introduzca la longitud del vector: ");
            
            try{
                longitud = entrada.nextInt();
            } 
            catch(InputMismatchException e) {
                System.out.println(e);
                System.out.println("Dato erroneo. Introducir numero entero.");
            }
            finally {
                entrada.nextLine();
            }
            if(longitud<0 || longitud>10){
                System.out.println("Debes introducir un numero entre 0 y 10");
            }
        } while(longitud<0 || longitud>10);
        
        return longitud;
    }
    
    public static void rellenarVector(int [] vector){
        for(int i=0; i < vector.length; i++){
            int valor = (int) Math.floor(Math.random()*6+1);
            vector[i] = valor;
        }
    }
    
    public static void mostrarVector(int [] vector){
        for(int i=0; i < vector.length; i++){
            System.out.println("El valor de la posicion " + (i+1) + " es igual a " + vector[i]);  
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[elegirLongitud()];
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
}
