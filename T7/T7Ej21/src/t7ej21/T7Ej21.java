/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej21;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarTablero(){
        System.out.println("    0      1      2");
        System.out.println("-----------------------");
        System.out.println("0|     "+"|       "+"|      "+"|");
        System.out.println("-----------------------");
        System.out.println("1|     "+"|       "+"|      "+"|");
        System.out.println("-----------------------");
        System.out.println("2|     "+"|       "+"|      "+"|");
        System.out.println("-----------------------");
    }
    
    public static void mostrarMatriz(char [][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){              
                    System.out.print(" [" + i + j + "]-->" + matriz[i][j] + "");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] TresEnRaya = new char[3][3];
        mostrarTablero();
        mostrarMatriz(TresEnRaya);
    }
    
}
