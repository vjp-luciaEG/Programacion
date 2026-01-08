/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej02;

/**
 *
 * @author alumno
 */
public class T7Ej02 {

    /**
     * @param args the command line arguments
     */
    
    public static void rellenarVector(int [] vector){
        for(int i=0; i < vector.length; i++){
            int valor = (int) Math.floor(Math.random()*100);
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
        int[] vector = new int[7];
        rellenarVector(vector);
        mostrarVector(vector);
        
    }
    
}
