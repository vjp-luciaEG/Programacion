/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej17;

/**
 *
 * @author lucia
 */
public class T7Ej17 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo que crea un array de 10 posiciones con numeros aleatorios del 0-9
    public static int [] crearArray(){
        int[] array = new int[10];
         
        for(int i=0; i < array.length; i++){
            int valor = (int) Math.floor(Math.random()*10);
            array[i] = valor;
        }
        return array;
    }
    
    public static void mostrarVector(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    public static void ordenarArrayDescendente(int[] array) {
        int aux;
        
        //Recorremos el array 9 veces con el metodo de la burbuja(n-1) = (array.length - 1 - i)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j+1]) { //Comparamos el valor de una posicion con el valor de la siguiente
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = crearArray();
        mostrarVector(array);
        ordenarArrayDescendente(array);
        mostrarVector(array);
        
    }
    
}
