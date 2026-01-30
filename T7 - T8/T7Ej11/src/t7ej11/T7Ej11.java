/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej11;

/**
 *
 * @author alumno
 */
public class T7Ej11 {

    /**
     * @param args the command line arguments
     */
    
    public static int [] rellenarVectorSinRepetir(int [] vector){
    
        for(int i=0; i < vector.length;i++){
            int numero = (int) Math.floor(Math.random()*10);
            boolean repetido = false;
            int j = 0;
            while (j < i || !repetido){
                if (vector[j] == numero){
                    repetido = true;   
                }                                   //EN DESARROLLO
                j++;   
            }
            if (!repetido) {
                    vector[i] = numero;
                }    
        }
        return vector;
    }   
    
    public static void mostrarVector(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sinRepetir = new int[10];
        
        System.out.println("Se ha generado el siguiente array: ");
        mostrarVector(rellenarVectorSinRepetir(sinRepetir));
    }
    
}
