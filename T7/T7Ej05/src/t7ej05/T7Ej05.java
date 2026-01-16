/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej05 {

    /**
     * @param args the command line arguments
     */
    
    public static int[][] introducirValoresMatriz(int [][] matriz){
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Introduce el valor de la posicion [" + i + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int [][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){              
                    System.out.print(" [" + i + j + "]-->" + matriz[i][j] + "");
            }
            System.out.println("\n");
        }
    }
    
    public static void mostrarMayor(int [][] matriz){
        int mayor = matriz[0][0];
        
        for(int i = 0; i < matriz.length; i++){   
            for(int j = 0; j < matriz[i].length; j++){        //EN DESARROLLO      
                    if(matriz[i][j] > mayor){
                        mayor = matriz[i][j];
                    }
            }
        }
        System.out.print("El mayor numero de la matriz es el " + matriz[0][0]);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][2];
        
        mostrarMatriz(introducirValoresMatriz(matriz));
        mostrarMayor(matriz);
        
    }
    
}
