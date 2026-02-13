/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej15;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author alumno
 */
public class T9Ej15 {

    /**
     * @param args the command line arguments
     */
    public static String introducirString() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = entrada.nextLine();

        return texto;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer texto = new StringTokenizer(introducirString(), " ");
        
        while(texto.hasMoreTokens()){
            System.out.println(texto.nextToken());
        }
        
        
    }
    
}
