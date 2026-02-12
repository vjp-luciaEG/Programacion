/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9Ej03 {

    /**
     * @param args the command line arguments
     */
    public static String introducirString(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un texto: ");
        String texto = entrada.nextLine();
        
        return texto;
    }
    
    public static void mostrarStringPorCaracter(String texto){
        char[] textoArray = texto.toCharArray();
        for(int i=0; i < texto.length();i++){
            System.out.println(textoArray[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarStringPorCaracter(introducirString());
    }
    
}
