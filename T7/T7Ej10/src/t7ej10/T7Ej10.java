/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej10;

/**
 *
 * @author lucia
 */
public class T7Ej10 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo que introduce valores aleatorios al vector pasado por parametro
    public static int [] rellenarVector(int [] vector){
        for(int i=0; i < vector.length; i++){
            int valor = (int) Math.floor(Math.random()*8+1);
            vector[i] = valor;
        }
        return vector;
    }
    
    //Metodo que muestra el vector
    public static void mostrarVector(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    //Metodo que sustituye los valores repetidos por 0
    public static int[] sustituirRepetidos(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            boolean repetido = false;

            //Comparamos el valor de v[i] con v[j] y si se repite, sustituimos v[j] por 0
            for (int j = 0; j < vector.length; j++) {
                if (i != j && vector[i] == vector[j]) {
                    repetido = true;
                    vector[j] = 0;
                }
            }
            //Si esta repetido, el valor de la posicion utilizada para encontrar repeticiones se sustituye por 0
            if (repetido) {
                vector[i] = 0;
            }
        }
        return vector;        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        
        rellenarVector(vector);
        System.out.println("Se han generado los siguientes numeros: ");
        mostrarVector(vector);
        sustituirRepetidos(vector);
        System.out.println("Sustituimos los elementos repetidos por un 0: " );
        mostrarVector(vector);
    }
    
}
