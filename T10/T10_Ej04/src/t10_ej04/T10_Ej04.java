/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10_Ej04 {

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
    
    public static void repetidosPorCero(ArrayList<Integer> lista){
        boolean encontrado;
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                encontrado = false;
                for(int j = 0; j < lista.size(); j++){
                    if(lista.get(i) == lista.get(j) && i != j){
                        lista.set(j,0);
                        encontrado = true;
                    }
                }
                if(encontrado){
                    lista.set(i, 0);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();
        
        rellenarLista(lista);
        System.out.println("Lista con repetidos:");
        mostrarLIsta(lista);
        repetidosPorCero(lista);
        System.out.println("\nLista sin repetidos:");
        mostrarLIsta(lista);
    }
    
}
