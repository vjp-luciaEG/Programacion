/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej06;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class T11Ej06 {

    /**
     * @param args the command line arguments
     */
    
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void mostrarMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1-Introducir donacion");
        System.out.println("2-Mostrar donaciones");
        System.out.println("3-Mostrar donaciones por nombre de donante");
        System.out.println("4-Mostrar numero de donaciones");
        System.out.println("5-Mostrar total dinero recaudado");
        System.out.println("6-Ordenar donaciones");
        System.out.println("7-Salir");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Campania c = new Campania();
        
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1:{
                    c.aniadirDonacion();
                    break;
                }
                case 2:{
                    c.mostrarDonaciones();
                    break;
                }
                case 3:{
                    c.mostrarDonacionesPorNombre(Donacion.introducirNombre());
                    break;
                }    
                case 4:{
                    c.mostrarNumeroDonaciones();
                    break;
                }
                case 5:{
                    c.mostrarTotalDineroDonaciones();
                    break;
                }
                case 6:{
                    c.mostrarDonaciones();
                    break;
                }
                case 7:{
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
            
        } while(opcion!=7);
    }
    
}
