/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej04;

/**
 *
 * @author alumno
 */
public class T7Ej04 {

    /**
     * @param args the command line arguments
     */
    
    public static int [][] rellenarMatriz(int [][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) Math.floor(Math.random()*200+100);
            }
        }
        return matriz;
    }
    
    public static void mostrarMatriz(int [][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j]%2==0){
                    System.out.print(" [" + i + j + "]-->" + matriz[i][j] + "");
                }
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][3];
        
        mostrarMatriz(rellenarMatriz(matriz));
    }
    
}
