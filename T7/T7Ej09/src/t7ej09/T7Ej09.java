/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej09;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej09 {

    /**
     * @param args the command line arguments
     */
    
    private static int numero;
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static int contarCifras(int numero){
         int cifras = 0;
         int aux = numero;
         
         while(aux > 0){
             aux = aux/10;
             cifras++;
         }         
         return cifras;
     }
     
    public static int[] rellenarArray(int cifras){
        int[] vector = new int[cifras];
        
        for(int i=0; i<vector.length; i++){
            vector[i] = numero % 10;
            numero = numero/10;
        }
        return vector;
    }
    
    public static void mostrarArrayInverso(int [] vector){
        int numeroInverso = 0;
        int divisor = 1;
        for(int i=vector.length - 1; i>=0; i--){
            numeroInverso = numeroInverso + vector[i]*divisor;
            divisor = divisor*10;
        }
        System.out.println("El numero introducido escrito al reves es " + numeroInverso);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarArrayInverso(rellenarArray(contarCifras(pedirNumero())));
    }
    
}
