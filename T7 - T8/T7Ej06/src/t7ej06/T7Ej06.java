/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej06;

/**
 *
 * @author alumno
 */
public class T7Ej06 {

    /**
     * @param args the command line arguments
     */
    
    public static int [] rellenarVector(int [] primos, boolean esPrimo){
        int numero = 0;
        int i=0;
        while(i < primos.length){
            if (esPrimo(numero)) {
                primos[i] = numero;
                i++;
            }
            numero++;
        }
        return primos;
    }
    
    public static void mostrarVector(int [] primos){
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println();
    }
    
     public static boolean esPrimo(int numero) {
        int i = 2;
        if (numero < 2) {
            return false;
        }
        while (i <= Math.sqrt(numero)){
            if (numero % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] primos = new int[80];
        
        mostrarVector(rellenarVector(primos, esPrimo(0)));
        
    }
    
}
