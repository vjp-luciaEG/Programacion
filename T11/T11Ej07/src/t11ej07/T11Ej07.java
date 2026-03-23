/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej07;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author alumno
 */
public class T11Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void introducirDonacionCampania(Set<Campania> campanias){
        System.out.println("Eleccion de Campaña");
        String texto = Donacion.introducirNombre();
        boolean encontrado = false;
        
        for(Campania c : campanias){
            if(c.getNombreCampania().equalsIgnoreCase(texto)){
                c.aniadirDonacion(texto);
                encontrado = true;
            }
        }
        
        if(!encontrado){
            System.err.println("Campaña no encontrada");
        }
    }
    public static void aniadirCampania(Set<Campania> campanias){
        System.out.println("Introduciendo campaña...");
        campanias.add(new Campania(Donacion.introducirNombre())); 
    }
    
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarCampaniasYDonaciones(Set<Campania> campanias){
        for(Campania c : campanias){
            System.out.println(c);
            c.mostrarDonaciones();
        }
    }
    
    public static void mostrarCampaniasYDonacionesXNombre(Set<Campania> campanias){
        System.out.println("Busqueda de Campaña");
        String texto = Donacion.introducirNombre();
        boolean encontrado = false;
        
        for(Campania c : campanias){
            if(c.getNombreCampania().equalsIgnoreCase(texto)){
                System.out.println(c);
                encontrado = true;
            }
        }
        
        if(!encontrado){
            System.err.println("Campaña no encontrada");
        }
    }
    
    public static void mostrarTotalDinero(Set<Campania> campanias){
        for(Campania c : campanias){
            System.out.println(c);
            c.mostrarTotalDineroDonaciones();
        }
    }
    
    public static void mostrarMayorDonacion(Set<Campania> campanias){
        double mayorCantidad = 0;
        Donacion mayorDonacion = new Donacion();
        
        for(Campania c : campanias){
            double cantidad = c.buscarMayorCantidad();
            if(cantidad > mayorCantidad){
                mayorCantidad = cantidad;
                mayorDonacion = c.buscarMayorDonacion();
            }
        }
        System.out.println("MAYOR DONACION: " + mayorDonacion);
    }
    
    public static void mostrarMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1-Introducir campaña");
        System.out.println("2-Añadir donacion");
        System.out.println("3-Mostrar campañas y donaciones");
        System.out.println("4-Mostrar campaña por nombre");
        System.out.println("5-Mostrar dinero recaudado");
        System.out.println("6-Mostar mayor donacion");
        System.out.println("7-Salir");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Campania> campanias = new HashSet<>();
        
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1:{
                    aniadirCampania(campanias);
                    break;
                }
                case 2:{
                    introducirDonacionCampania(campanias);
                    break;
                }
                case 3:{
                    mostrarCampaniasYDonaciones(campanias);
                    break;
                }    
                case 4:{
                    mostrarCampaniasYDonacionesXNombre(campanias);
                    break;
                }
                case 5:{
                    mostrarTotalDinero(campanias);
                    break;
                }
                case 6:{
                    mostrarMayorDonacion(campanias);
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
