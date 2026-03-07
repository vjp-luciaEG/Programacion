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
    
    //Metodo para rellenar el ArrayList 
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);

        int opcionUsuario;
        
        do {
            System.out.println("Introduce un numero:");
            opcionUsuario = entrada.nextInt();      //Se pide un valor al usuario
            if(opcionUsuario>=0){                   //Si el valor es positivo se añade a la lista y se pide otro numero
                lista.add(opcionUsuario);
            }
        } while (opcionUsuario >= 0);                //Si el valor introducido es negativo no se añade y finaliza el bucle
    }   
    
    //Metodo para mostrar datos del ArrayList
    public static void mostrarLIsta(ArrayList<Integer> lista) {
        if (!lista.isEmpty()) { //Control de excepcion NullPointer
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i));
            }
        }
    }
    
    //Metodo que obtiene el mayor valor par y el menor valor impar de la lista y intercambia sus posiciones
    public static void esMayorParMenorImpar(ArrayList<Integer> lista){
        int esMayorPar = lista.get(0);
        int esMenorImpar= lista.get(0);              //Declaramos las variables con un valor de la lista.
        int posicionMayor = 0, posicionMenor = 0;
        
        if (lista.size() > 1) {                              //Control de excepciones NullPointer + Control de condicion para intercambiar posiciones (Tamaño de la lista > 1)
            for (int i = 0; i < lista.size(); i++) {         //Recorremos el ArrayList completo
                if(esMayorPar < lista.get(i) && lista.get(i)%2 == 0){    //Obtener el mayor valor par y su posicion
                    esMayorPar = lista.get(i);                              
                    posicionMayor = i;
                }
                if(esMenorImpar > lista.get(i) && lista.get(i)%2 != 0){     //Obtener el menor valor impar y su posicion
                    esMenorImpar = lista.get(i);                            
                    posicionMenor = i;
                }
            }
            
            lista.set(posicionMayor, esMenorImpar);     //Intercambio de valores por posicion con el metodo set(posicion, valor)
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
