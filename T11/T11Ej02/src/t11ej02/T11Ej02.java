/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T11Ej02 {

    /**
     * @param args the command line arguments
     */
    public static String pedirClave(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la clave del producto:");
        String clave = entrada.nextLine();
        return clave;
    }
    public static void introducirProductos(Map<String, Producto> productos){
        productos.put(pedirClave(), new Producto(Producto.pedirNombre(), Producto.pedirPrecio(), Producto.pedirStock()));
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
        System.out.println("1-MENU ADMINISTRACION");
        System.out.println("2-MENU COMPRA");
        System.out.println("3-SALIR");
    }

    //Mostrar menu administracion
    public static void mostrarMenuAdmin() {
        System.out.println("=== MENU ===");
        System.out.println("1-Introducir productos en la lista");
        System.out.println("2-Mostrar todos los productos");
        System.out.println("3-Eliminar productos");
        System.out.println("4-Volver al menu principal");
    }

    //Mostrar menu compraVolver al menu principal
    public static void mostrarMenuCompra() {
        System.out.println("=== MENU ===");
        System.out.println("1-Comprar productos");
        System.out.println("2-Volver al menu principal");
    }

    public static void mostrarProductos(Map<String, Producto> mapProductos){
        for(String clave : mapProductos.keySet()){
            System.out.println( clave + " " + mapProductos.get(clave));
        }
    }
    
    public static void menuPrincipal(){
        int opcion;
        do {
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1:{
                    
                    break;
                }
                case 2:{
                    
                    break;
                } 
                case 3:{
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
        } while (opcion != 3);
    }
    
    public static void menuAdmin(Map<String, Producto> mapProductos){
        int opcion;
        do {
            mostrarMenuAdmin();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1:{
                    introducirProductos(mapProductos);
                    break;
                }
                case 2:{
                    mostrarProductos(mapProductos);
                    break;
                } 
                case 3:{
                    
                    break;
                } 
                case 4:{
                    System.err.println("Volviendo al menu principal...");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
        } while (opcion != 3);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Producto> mapProductos = new HashMap<>();

        int opcion;
        
    }

}
