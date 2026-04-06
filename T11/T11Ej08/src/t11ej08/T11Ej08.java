/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej08;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author lucia
 */
public class T11Ej08 {

    /**
     * @param args the command line arguments
     */
    
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //Mostrar menu
    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Insertar ciudad");
        System.out.println("2-Mostrar ciudades");
        System.out.println("3-Buscar autobus por matricula");
        System.out.println("4-Buscar conductor");
        System.out.println("5-Autobus con mayor numero de conductores");
        System.out.println("6-Salir");
    }
    
    public static void mostrarCiudades(ArrayList<Ciudad> ciudades){
        for(Ciudad c : ciudades){
            System.out.println(c);
        }
    }
    
    public static void insertarCiudad (ArrayList<Ciudad> ciudades){
        ciudades.add(new Ciudad(Sede.introducirNombre(), Ciudad.aniadirSede()));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        
        int opcion;
        do {                        //Menu de opciones
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1: {
                    insertarCiudad(ciudades);
                    break;
                }
                case 2: {
                    mostrarCiudades(ciudades);
                    break;
                }
                case 3: {
                  
                    break;
                }
                case 4: {
                  
                    break;
                }
                case 5: {
                
                    break;
                }
                case 6: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }

        } while (opcion != 6);
    }
    
}
