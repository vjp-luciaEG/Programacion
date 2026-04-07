/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej08;

import java.util.ArrayList;
import java.util.Iterator;
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
    public static void buscarCiudad(ArrayList<Ciudad> ciudades, String nombre){
        int i = 0;
        boolean encontrado = false;
        
        while(i<ciudades.size() && !encontrado){
           if(ciudades.get(i).getNombre().equalsIgnoreCase(nombre)){
               encontrado = true;
               ciudades.get(i).aniadirSede();
           }
           i++;
        }
    }
    
    public static void buscarNombreSede(ArrayList<Ciudad> ciudades){
        boolean encontrado = false;
        
        for(Ciudad c: ciudades){
            encontrado = c.buscarSedes(Sede.introducirNombre());
            if(encontrado){
                System.out.println(c.getNombre());
            }
        }
    }
    public static double calcularMediaIngresos(ArrayList<Ciudad> ciudades){
        double suma = 0;
        int numSedes = 0;
        for(Ciudad c: ciudades){
            for(Sede s : c.getSedes()){
                suma += s.getIngresoAnual();
                numSedes++;
            }
        }
        
        double media = suma/numSedes;
        return media;
    }
    
    public static void mostrarSedesMediaSuperior(ArrayList<Ciudad> ciudades, double media){
        for(Ciudad c: ciudades){
            for(Sede s : c.getSedes()){
                if(s.getIngresoAnual() > media){
                    System.out.println("Ciudad: " + c.getNombre() + " Sede: " + s);
                }
            }
        }
    }
    
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
        System.out.println("3-Sedes con ingresos superiores a la media");
        System.out.println("4-Buscar por nombre de sede");
        System.out.println("5-Introducir sede");
        System.out.println("6-Mostrar sedes");
        System.out.println("7-Salir");
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
                    mostrarSedesMediaSuperior(ciudades, calcularMediaIngresos(ciudades));
                    break;
                }
                case 4: {
                    buscarNombreSede(ciudades);
                    break;
                }
                case 5: {
                    buscarCiudad(ciudades, Sede.introducirNombre());
                    break;
                }
                case 6: {
                
                    break;
                }
                case 7: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }

        } while (opcion != 7);
    }
    
}
