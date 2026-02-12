/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9Ej07 {

    /**
     * @param args the command line arguments
     */
    public static String introducirString() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = entrada.nextLine();

        return texto;
    }

    public static void mostrarTextoInvertido(String texto) {
        String[] palabras = texto.split(" ");

        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.println(palabras[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        mostrarTextoInvertido(introducirString());
    }

}
