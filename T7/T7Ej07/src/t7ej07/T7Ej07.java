/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej07;

/**
 *
 * @author alumno
 */
public class T7Ej07 {

    /**
     * @param args the command line arguments
     */
    
    public static int [] rellenarVector(int [] vector){
        for(int i=0; i < vector.length; i++){
            int valor = (int) Math.floor(Math.random()*50);
            vector[i] = valor;
        }
        return vector;
    }
    
    public static void mostrarMayores(int [] vector){
        for(int i=0; i< vector.length - 1; i++){
            for(int j=0; j < vector.length - 1 - i; j++){
                if(vector[j] < vector[j+1]){
                    int aux = vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
        }

        for (int i = 0; i < vector.length - 5; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[15];
        
        mostrarMayores(rellenarVector(vector));
        
    }
    
}
