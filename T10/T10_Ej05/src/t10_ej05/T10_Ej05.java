/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_Ej05 {

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
                System.out.print(lista.get(i));
            }
        }
    }
    
     public static void esMayorParMenorImpar(ArrayList<Integer> lista){
        int esMayorPar = lista.get(0);
        int esMenorImpar= lista.get(0);
        int posicionMayor = 0, posicionMenor = 0;
        if (lista.size() > 1) {
            for (int i = 0; i < lista.size(); i++) {
                if(esMayorPar < lista.get(i) && lista.get(i)%2 == 0){
                    esMayorPar = lista.get(i);
                    posicionMayor = i;
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                if(esMenorImpar > lista.get(i) && lista.get(i)%2 != 0){
                    esMenorImpar = lista.get(i);
                    posicionMenor = i;
                }
            }
            lista.set(posicionMayor, esMenorImpar);
            lista.set(posicionMenor, esMayorPar);
            
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();
        
        rellenarLista(lista);
        System.out.println("Lista sin modificar:");
        mostrarLIsta(lista);
        esMayorParMenorImpar(lista);
        System.out.println("\nLista modificada:");
        mostrarLIsta(lista);
    }
    
}
