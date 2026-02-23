/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);

        int opcionUsuario;
        do {
            System.out.println("Introduce un numero:");
            opcionUsuario = entrada.nextInt();
            if(opcionUsuario>=0){
                lista.add(opcionUsuario);
            }
        } while (opcionUsuario >= 0);
    }

    public static void mostrarLIsta(ArrayList<Integer> lista) {
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }
    
    public static void esMayor(ArrayList<Integer> lista){
        int esMayor = lista.get(0);
        
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                if(esMayor < lista.get(i)){
                    esMayor = lista.get(i);
                }
            }
        }
        System.out.println("El mayor numero es " +  esMayor);
    }
    
    public static void esMenor(ArrayList<Integer> lista){
        int esMenor = lista.get(0);
        
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                if(esMenor > lista.get(i)){
                    esMenor = lista.get(i);
                }
            }
        }
        System.out.println("El menor numero es " +  esMenor);
    }
    
    public static void suma(ArrayList<Integer> lista){
        int suma = 0;
        
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                suma += lista.get(i);
            }
        }
        System.out.println("La suma de todos los elementos es " +  suma);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();
        
        rellenarLista(lista);
        mostrarLIsta(lista);
        esMayor(lista);
        esMenor(lista);
        suma(lista);
    }

}
