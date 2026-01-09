/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej08;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej08 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero de 5 cifras: ");
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static int[] rellenarArray(int numero){
        int[] vector = new int[5];
        
        for(int i=0; i<vector.length; i++){
            vector[i] = numero % 10;
            numero = numero/10;
        }
        return vector;
    }
    
    public static void mostrarArrayInverso(int [] vector){
        int numeroInverso = 0;
        int divisor = 10000;
        for(int i=0; i < vector.length; i++){
            numeroInverso = numeroInverso + vector[i]*divisor;
            divisor = divisor/10;
        }
        System.out.println("El numero introducido escrito al reves es " + numeroInverso);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = pedirNumero();
        mostrarArrayInverso(rellenarArray(numero));
        
        
    }
    
}
